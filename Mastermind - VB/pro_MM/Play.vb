Public Class Play
    Public colours(5) As Color
    Public hiddencode As String = ""
    Public codecolors(3) As Color
    Public picClr(3) As Color
    Public pic(3) As PictureBox
    Public focusColor As Color
    Public focusPic As PictureBox
    Public NumCodeGuessed(3) As String
    Public guesscounter As Integer = 0
    Public allGuesses(10) As String
    Public Const MAX_GUESSES As Integer = 10

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        'declaring colours to be used
        Dim colours(5) As Color
        colours(0) = Color.BlueViolet
        colours(1) = Color.Red
        colours(2) = Color.GreenYellow
        colours(3) = Color.Orange
        colours(4) = Color.Cyan
        colours(5) = Color.CadetBlue

        'giving colours to buttons on designer
        Dim button(5) As Button
        button(0) = btnSelectColor1
        button(1) = btnSelectColor2
        button(2) = btnSelectColor3
        button(3) = btnSelectColor4
        button(4) = btnSelectColor5
        button(5) = btnSelectColor6

        'assigning picture boxes to array
        pic(0) = picSelection1
        pic(1) = picSelection2
        pic(2) = picSelection3
        pic(3) = picSelection4

        'setting unselected numeric guess slots to begin as "x"s
        NumCodeGuessed(0) = "-"
        NumCodeGuessed(1) = "-"
        NumCodeGuessed(2) = "-"
        NumCodeGuessed(3) = "-"

        'assigning the colours to the buttons
        For n As Integer = 0 To 5
            button(n).BackColor = colours(n)
        Next

        'creating random code
        Dim code(3) As Color
        Dim draw As Integer

        For n As Integer = 0 To 3
            Randomize()
            draw = Int(Rnd() * 6 + 1)
            If hiddencode.Contains(draw) Then
                Dim rep As Integer = draw
                Do
                    draw = 0
                    Randomize()
                    draw = Int(Rnd() * 6 + 1)
                Loop Until hiddencode.Contains(draw) = False
            End If
            hiddencode &= draw
            codecolors(n) = colours(draw - 1)
        Next
        lblCode.Text = hiddencode


    End Sub

    Private Sub ColorSelect_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSelectColor1.Click, btnSelectColor2.Click, btnSelectColor3.Click, btnSelectColor4.Click, btnSelectColor5.Click, btnSelectColor6.Click

        If rad1.Checked = False And rad2.Checked = False And rad3.Checked = False And rad4.Checked = False Then
            MessageBox.Show("Please select a slot.")

        Else
            'assigning color of slot by button clicked
            focusPic.BackColor = sender.backcolor
            'assigning numeric value in tags to the guess
            If rad1.Checked = True Then NumCodeGuessed(0) = sender.tag
            If rad2.Checked = True Then NumCodeGuessed(1) = sender.tag
            If rad3.Checked = True Then NumCodeGuessed(2) = sender.tag
            If rad4.Checked = True Then NumCodeGuessed(3) = sender.tag

        End If


    End Sub

    Private Sub rad1_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad1.CheckedChanged
        focusPic = picSelection1
    End Sub

    Private Sub rad2_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad2.CheckedChanged
        focusPic = picSelection2
    End Sub

    Private Sub rad3_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad3.CheckedChanged
        focusPic = picSelection3
    End Sub

    Private Sub rad4_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad4.CheckedChanged
        focusPic = picSelection4
    End Sub

    Private Sub btnGuess_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnGuess.Click
        'counting guesses
        guesscounter += 1
        If guesscounter <= 10 Then
            lblGuessesLeft.Text = "Guesses left: " & 10 - guesscounter
        Else
            lblGuessesLeft.Text = "No more guesses."
        End If


        'creating numeric guess value
        Dim showGuess As String = ""

        For n As Integer = 0 To 3
            showGuess &= NumCodeGuessed(n)
        Next

        '"If statement" to prevent program crash
        If guesscounter <= 10 Then
            allGuesses(guesscounter - 1) = showGuess
            lblGuess.Text = "Guess: " & showGuess
        End If
        'setting color values of a guess
        Dim picClr(3) As Color
        picClr(0) = picSelection1.BackColor
        picClr(1) = picSelection2.BackColor
        picClr(2) = picSelection3.BackColor
        picClr(3) = picSelection4.BackColor
        'creating hints based on conditions
        Dim hints As String = Nothing
        Dim xcounter As Integer = Nothing
        Dim ocounter As Integer = Nothing
        For n As Integer = 0 To 3
            'concating "x" if a color is correct in position
            If picClr(n) = codecolors(n) Then
                xcounter += 1
                'removing value to prevent detection by next filter
                picClr(n) = Nothing
            End If
            'concating "o" if only color is part of the sequence
            If codecolors.Contains(picClr(n)) Then
                ocounter += 1
            End If
        Next
        'order of hints cannot correlate to the guess
        For n As Integer = 1 To xcounter
            hints &= "x"
        Next
        For n As Integer = 1 To ocounter
            hints &= "o"
        Next
        

        'creating colored labels to show previous guesses
        'left side
        If guesscounter <= 5 Then

            For h As Integer = 1 To 4
                Dim picbx As New Label
                picbx.Size = New Size(46, 46)
                picbx.Location = New Point(30 + 52 * (h - 1), 188 + 52 * guesscounter)
                picbx.BackColor = picClr(h - 1)
                Controls.Add(picbx)

            Next
            Dim guessNumLbl As New Label
            guessNumLbl.Size = New Size(25, 25)
            guessNumLbl.Location = New Point(5, 196 + 52 * guesscounter)
            guessNumLbl.BackColor = Color.DimGray
            guessNumLbl.Text = guesscounter
            guessNumLbl.ForeColor = Color.White
            guessNumLbl.TextAlign = ContentAlignment.MiddleCenter
            Controls.Add(guessNumLbl)

            Dim lblHint As New Label
            lblHint.Size = New Size(18, 4)
            lblHint.Location = New Point(186, 196 + 52 * guesscounter)
            lblHint.BackColor = Color.DimGray
            lblHint.Text = hints
            lblHint.ForeColor = Color.White
            lblHint.TextAlign = ContentAlignment.MiddleCenter
            Controls.Add(lblHint)
        End If
        'continued on right side to preserve space
        If guesscounter > 5 And 10 >= guesscounter Then

            For h As Integer = 1 To 4
                Dim picbx As New Label
                picbx.Size = New Size(46, 46)
                picbx.Location = New Point(314 + 52 * (h - 1), 188 + 52 * (guesscounter - 5))
                picbx.BackColor = picClr(h - 1)
                Controls.Add(picbx)

            Next
            Dim guessNumLbl As New Label
            guessNumLbl.Size = New Size(25, 25)
            guessNumLbl.Location = New Point(289, 196 + 52 * (guesscounter - 5))
            guessNumLbl.BackColor = Color.DimGray
            guessNumLbl.Text = guesscounter
            guessNumLbl.ForeColor = Color.White
            guessNumLbl.TextAlign = ContentAlignment.MiddleCenter
            Controls.Add(guessNumLbl)

            Dim lblHint As New Label
            lblHint.Size = New Size(18, 4)
            lblHint.Location = New Point(186, 196 + 52 * guesscounter)
            lblHint.BackColor = Color.DimGray
            lblHint.Text = hints
            lblHint.ForeColor = Color.White
            lblHint.TextAlign = ContentAlignment.MiddleCenter
            Controls.Add(lblHint)
        End If


        'Response message if player wins
        If showGuess = hiddencode Then
            MessageBox.Show("You cracked the code in " & guesscounter & " guesses.")
            lblCode.Visible = True
        End If


        'declaring and hiding colors of hidden code
        Dim answers(3) As PictureBox
        answers(0) = PictureBox1
        answers(1) = PictureBox2
        answers(2) = PictureBox3
        answers(3) = PictureBox4
        'reveal answer after last incorrect guess
        If guesscounter = MAX_GUESSES Then
            lblAnswer.Show()
            For n As Integer = 0 To 3
                answers(n).BackColor = codecolors(n)
                answers(n).Visible = True
            Next
        End If
        'Response when guess btn clicked after game over
        If guesscounter > MAX_GUESSES Then
            MessageBox.Show("The game is over")
        End If


    End Sub


    Private Sub btnNewGame_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNewGame.Click
        Application.Restart()

    End Sub

    Private Sub btnBAGame_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBAGame.Click
        Me.Location = Home.Location
        Me.Hide()
        Home.Show()
    End Sub

    Private Sub HowToPlayToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HowToPlayToolStripMenuItem.Click
        Me.Location = Instructions.Location
        Instructions.Show()
        Me.Hide()
    End Sub

    Private Sub HighscoresToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HighscoresToolStripMenuItem.Click
        Me.Location = Highscores.Location
        Highscores.Show()
        Me.Hide()
    End Sub

    Private Sub HomeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Location = Home.Location
        Home.Show()
        Me.Hide()
    End Sub

    Private Sub OptionsToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)

    End Sub

    Private Sub QuitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles QuitToolStripMenuItem.Click
        Application.Exit()
    End Sub
End Class

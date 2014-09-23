Public Class game
    Public colours(5) As Color
    Public number As String
    Public code(3) As Color
    Public picClr(3) As Color

    Public pic(3) As PictureBox
    Public btn As Button
    Public focusColor As Color
    Public focusPic As PictureBox
    Public button(5) As Button
    Public guessCode As String = ""
    Public cod(3) As String
    Public store(10) As String
    Public counter As Integer = 0
    Public newGuess(3) As Color
    Public allGuesses(10) As String
    Public myFont As Font
    Public comic As System.Drawing.Font
    Public Const maxGuesses As Integer = 0

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
        button(0) = btn1
        button(1) = btn2
        button(2) = btn3
        button(3) = btn4
        button(4) = btn5
        button(5) = btn6

        Dim a As Integer
        'buttons to represent the six colours
        For a = 0 To 5
            button(a).BackColor = colours(a)


        Next




        number = ""
        Dim code(3) As Color
        Dim draw As Integer


        For k As Integer = 0 To 3
            Randomize()
            draw = Int(Rnd() * 6 + 1)

            If number.Contains(draw) Then
                Dim rep As Integer = draw
                Do
                    draw = 0
                    Randomize()
                    draw = Int(Rnd() * 6 + 1)

                Loop Until number.Contains(draw) = False

            End If

            number &= draw
            code(k) = colours(draw - 1)
        Next


        lblCode.Text = number

        'For us As Integer = 1 To 4

        '    Dim btn As New Button
        '    Const s As Integer = 20
        '    btn.Size = New Size(s, s)
        '    btn.Location = New Point(us * 2 * s, 2 * s)
        '    Controls.Add(btn)

        '    btn.BackColor = code(us - 1)
        'Next

        pic(0) = pic1
        pic(1) = pic2
        pic(2) = pic3
        pic(3) = pic4

        Dim myFont As Font
        myFont = lblHints.Font

        Dim comic As System.Drawing.Font
        comic = lblHints.Font


    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btn1.Click, btn2.Click, btn3.Click, btn4.Click, btn5.Click, btn6.Click


        If rad1.Checked = False And rad2.Checked = False And rad3.Checked = False And rad4.Checked = False Then
            MessageBox.Show("Please select a  position for the colour.")
        Else

            focusPic.BackColor = sender.backcolor

            If rad1.Checked Then cod(0) = sender.tag
            If rad2.Checked Then cod(1) = sender.tag
            If rad3.Checked Then cod(2) = sender.tag
            If rad4.Checked Then cod(3) = sender.tag
        End If


    End Sub

    Private Sub rad1_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad1.CheckedChanged
        focusPic = pic1
    End Sub

    Private Sub rad2_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad2.CheckedChanged
        focusPic = pic2
    End Sub

    Private Sub rad3_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad3.CheckedChanged
        focusPic = pic3
    End Sub

    Private Sub rad4_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles rad4.CheckedChanged
        focusPic = pic4
    End Sub

    Private Sub btnGuess_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnGuess.Click
        'Call rad1_CheckedChanged(sender, e)
        'Call rad2_CheckedChanged(sender, e)
        'Call rad3_CheckedChanged(sender, e)
        'Call rad4_CheckedChanged(sender, e)


        counter += 1

        lblNumGuesses.Text = "Number of Guesses left: " & 10 - counter

        Dim picClr(3) As Color

        picClr(0) = pic1.BackColor
        picClr(1) = pic2.BackColor
        picClr(2) = pic3.BackColor
        picClr(3) = pic4.BackColor

        guessCode = ""

        For t As Integer = 0 To 3
            guessCode &= cod(t)

        Next

        allGuesses(counter - 1) = guessCode
        lblGuess.Text = "Guess: " & guessCode





        Dim hints As String = ""

        For Each letter As Char In guessCode

            If guessCode.IndexOf(letter) = number.IndexOf(letter) Then
                hints &= "x"
            ElseIf number.Contains(letter) Then
                hints &= "o"
            ElseIf number.Contains(letter) = False Then
                hints &= ""
            End If
        Next

        lblHints.Text = hints




        'Dim l As Integer = hints.Length - 1
        'Dim pos(l) As Integer
        'Dim order As String = ""

        'For s As Integer = 0 To l
        '    Randomize()
        '    pos(s) = Int(Rnd() * l + 1)


        '    If order.Contains(pos(s)) Then
        '        Dim rep As Integer = pos(s)
        '        Do
        '            pos(s) = 0
        '            Randomize()
        '            pos(s) = Int(Rnd() * l + 1)

        '        Loop Until order.Contains(pos(s)) = False

        '    End If

        '    order &= pos(s)

        'Next

        'Label4.Text = order



        'For us As Integer = 1 To 4

        '    Dim btn As New Button
        '    Const s As Integer = 20
        '    btn.Size = New Size(s, s)
        '    btn.Location = New Point(us * 2 * s, 2 * s)
        '    Controls.Add(btn)

        '    btn.BackColor = code(us - 1)
        'Next

        For h As Integer = 1 To 5
            Dim pb As New Label
            Dim s As Integer = 22
            pb.Size = New Size(s, s)
            pb.Location = New Point(h * 2 * s, 5 * s + counter * 25)

            If h <> 5 Then
                pb.BackColor = pic(h - 1).BackColor
            End If

            If h = 5 Then
                pb.Size = New Size(2 * s, s)
                pb.Font = comic
                pb.Text = hints


            End If

            Controls.Add(pb)

        Next


        For y As Integer = 0 To 3
            pic(y).BackColor = newGuess(y)
        Next


        Dim answers(3) As PictureBox
        answers(0) = PictureBox1
        answers(1) = PictureBox2
        answers(2) = PictureBox3
        answers(3) = PictureBox4






        If guessCode = number Then
            MessageBox.Show("You cracked the code in " & counter & " guesses.")
            lblCode.Visible = True
            For z As Integer = 0 To 3
                answers(z).BackColor = code(z)
                answers(z).Visible = True
            Next
        End If

        If counter = 11 Then
            MessageBox.Show("Sorry, your tries have run out. ")

            For z As Integer = 0 To 3

                answers(z).BackColor = code(z)
                answers(z).Visible = True
            Next

        End If


        'PLAY WETOPIA
    End Sub


    Private Sub btnNewGame_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnNewGame.Click
        Call Form1_Load(sender, e)

    End Sub
End Class

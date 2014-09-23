Public Class proMM
    Public colours(5) As Color
    Public number As String
    Public code(3) As Color
    Public pic(3) As PictureBox



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
        button(0) = Button1
        button(1) = Button2
        button(2) = Button3
        button(3) = Button4
        button(4) = Button5
        button(5) = Button6

        Dim pic(3) As PictureBox
        pic(0) = pic1
        pic(1) = pic2
        pic(2) = pic3
        pic(3) = pic4

        Dim a As Integer
        'buttons to represent the six colours
        For a = 1 To 6

            Dim btn As New Button
            Const s As Integer = 20
            btn.Size = New Size(s, s)
            btn.Location = New Point(a * s, s)
            Controls.Add(btn)

            btn.BackColor = colours(a - 1)

            button(a - 1).BackColor = colours(a - 1)

        Next

        Label1.Text = ""


        Dim number As String = ""
        Dim code(3) As Color
        Dim draw As Integer

        'generating a sequence of unique random numbers for colour code
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


        Label1.Text = number




        For ca As Integer = 1 To 6

            Dim btn As New Button
            Const s As Integer = 20
            btn.Size = New Size(s, s)
            btn.Location = New Point(ca * s, s)
            Controls.Add(btn)

            btn.BackColor = colours(ca - 1)


        Next


        For us As Integer = 1 To 4

            Dim btn As New Button
            Const s As Integer = 20
            btn.Size = New Size(s, s)
            btn.Location = New Point(us * 2 * s, 2 * s)
            Controls.Add(btn)

            btn.BackColor = code(us - 1)


        Next

        Dim guess As String = ""
        Dim hint As Char = ""
        Dim allHints As String = ""
        For counter As Integer = 0 To 3
            Dim ask As Integer = Val(InputBox("Please eneter a number corresponding to the colour you choose"))
            guess &= ask

        Next

        For counter As Integer = 0 To 3
            If guess.Contains(number.Chars(counter)) Then
                hint = "x"
                If guess.IndexOf(number.Chars(counter)) = number.IndexOf(counter) Then
                    hint = "y"
                End If
            End If
            allHints &= hint
        Next

        Label2.Text = guess & hint






    End Sub

    Private Sub Label1_MouseDown(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles Label1.MouseDown
        Dim lbl As Label
        lbl = CType(sender, Label)

    End Sub

    Private Sub pic1_DragEnter(ByVal sender As Object, ByVal e As System.Windows.Forms.DragEventArgs) Handles pic1.DragEnter, pic2.DragEnter, pic3.DragEnter, pic4.DragEnter

        Dim pic As Image
        pic = e.Data.GetData(GetType(Image))


    End Sub
    'Sub buttonClicked(By 

    '    End Sub

    'Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click, Button2.Click, Button3.Click, Button4.Click, Button5.Click, Button6.Click
    '    Dim btns As Button
    '    btns = (CType(sender, Button))

    '    For num As Integer = 1 To 4
    '        pic(num).BackColor = 


    '    Next

    'End Sub
End Class

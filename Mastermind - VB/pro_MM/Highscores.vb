Imports System.IO
Public Class Highscores
    Const FILE_NAME As String = "highscores.txt"
    Private Sub HomeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Location = Home.Location
        Home.Show()
        Me.Hide()
    End Sub

    Private Sub HowToPlayToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HowToPlayToolStripMenuItem.Click
        Me.Location = Instructions.Location
        Instructions.Show()
        Me.Hide()
    End Sub

    Private Sub QuitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles QuitToolStripMenuItem.Click
        Application.Exit()
    End Sub

    Private Sub btnBAHighscores_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBAHighscores.Click
        Me.Location = Home.Location
        Home.Show()
        Me.Hide()
    End Sub

    Private Sub Highscores_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Dim highscorefile As New FileInfo(FILE_NAME)
        If Not highscorefile.Exists Then
            highscorefile.Create()
            MessageBox.Show("new file created")
        Else
            MessageBox.Show(highscorefile.FullName & " exists. File size: " & highscorefile.Length)
        End If


    End Sub
End Class
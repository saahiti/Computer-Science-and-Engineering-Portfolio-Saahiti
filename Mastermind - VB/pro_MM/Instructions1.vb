Public Class Instructions1

    Private Sub HomeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Location = Home.Location
        Home.Show()
        Me.Hide()

    End Sub

    Private Sub QuitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles QuitToolStripMenuItem.Click
        Application.Exit()
    End Sub

    Private Sub btnBAHowPlay1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBAHowPlay1.Click
        Me.Location = Instructions.Location
        Instructions.Show()
        Me.Hide()

    End Sub

    Private Sub HighscoresToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HighscoresToolStripMenuItem.Click
        Me.Location = Highscores.Location
        Highscores.Show()
        Me.Hide()
    End Sub

    Private Sub Instructions1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub

    Private Sub PlayToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PlayToolStripMenuItem.Click
        Me.Location = Play.Location
        Play.Show()
        Me.Hide()

    End Sub

    Private Sub btnPlay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnPlay.Click
        Me.Location = Play.Location
        Play.Show()
        Me.Hide()
    End Sub
End Class
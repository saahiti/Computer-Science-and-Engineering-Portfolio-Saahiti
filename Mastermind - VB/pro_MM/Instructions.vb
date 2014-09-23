Public Class Instructions

    Private Sub HomeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Location = Home.Location
        Home.Show()
        Me.Hide()

    End Sub

    Private Sub QuitToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles QuitToolStripMenuItem.Click
        Application.Exit()
    End Sub

    Private Sub btnBAHowPlay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBAHowPlay.Click
        Me.Location = Home.Location
        Home.Show()
        Me.Hide()

    End Sub

    Private Sub btnFAHowPlay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnFAHowPlay.Click
        Me.Location = Instructions1.Location
        Instructions1.Show()
        Me.Hide()

    End Sub

    Private Sub HighscoresToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HighscoresToolStripMenuItem.Click
        Me.Location = Highscores.Location
        Highscores.Show()
        Me.Hide()
    End Sub

    Private Sub PlayToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PlayToolStripMenuItem.Click
        Me.Location = Play.Location
        Play.Show()
        Me.Hide()

    End Sub
End Class
Public Class Home

    Private Sub btnStart_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnStart.Click
        Me.Location = Play.Location
        Play.Show()
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

    Private Sub btnInstructions_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnInstructions.Click
        Me.Location = Instructions.Location
        Instructions.Show()
        Me.Hide()

    End Sub

    Private Sub btnHighscores_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnHighscores.Click
        Me.Location = Highscores.Location
        Highscores.Show()
        Me.Hide()
    End Sub

    Private Sub HomeToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)

    End Sub

    Private Sub PlayToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PlayToolStripMenuItem.Click
        Me.Location = Play.Location
        Play.Show()
        Me.Hide()

    End Sub
End Class

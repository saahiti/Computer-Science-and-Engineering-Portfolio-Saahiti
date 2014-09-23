<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Instructions1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip
        Me.MenuToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.HomeToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.HighscoresToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.QuitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.btnBAHowPlay1 = New System.Windows.Forms.Button
        Me.lblHTP4 = New System.Windows.Forms.Label
        Me.pbxHTP3 = New System.Windows.Forms.PictureBox
        Me.lblHTP5 = New System.Windows.Forms.Label
        Me.PlayToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.btnPlay = New System.Windows.Forms.Button
        Me.MenuStrip1.SuspendLayout()
        CType(Me.pbxHTP3, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.MenuToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(539, 24)
        Me.MenuStrip1.TabIndex = 4
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'MenuToolStripMenuItem
        '
        Me.MenuToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.PlayToolStripMenuItem, Me.HomeToolStripMenuItem, Me.HighscoresToolStripMenuItem, Me.QuitToolStripMenuItem})
        Me.MenuToolStripMenuItem.Name = "MenuToolStripMenuItem"
        Me.MenuToolStripMenuItem.Size = New System.Drawing.Size(50, 20)
        Me.MenuToolStripMenuItem.Text = "Menu"
        '
        'HomeToolStripMenuItem
        '
        Me.HomeToolStripMenuItem.Name = "HomeToolStripMenuItem"
        Me.HomeToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.HomeToolStripMenuItem.Text = "Home"
        '
        'HighscoresToolStripMenuItem
        '
        Me.HighscoresToolStripMenuItem.Name = "HighscoresToolStripMenuItem"
        Me.HighscoresToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.HighscoresToolStripMenuItem.Text = "Highscores"
        '
        'QuitToolStripMenuItem
        '
        Me.QuitToolStripMenuItem.Name = "QuitToolStripMenuItem"
        Me.QuitToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.QuitToolStripMenuItem.Text = "Quit"
        '
        'btnBAHowPlay1
        '
        Me.btnBAHowPlay1.BackgroundImage = Global.pro_MM.My.Resources.Resources.back_arrow_key
        Me.btnBAHowPlay1.Location = New System.Drawing.Point(12, 27)
        Me.btnBAHowPlay1.Name = "btnBAHowPlay1"
        Me.btnBAHowPlay1.Size = New System.Drawing.Size(62, 69)
        Me.btnBAHowPlay1.TabIndex = 6
        Me.btnBAHowPlay1.UseVisualStyleBackColor = True
        '
        'lblHTP4
        '
        Me.lblHTP4.AutoSize = True
        Me.lblHTP4.BackColor = System.Drawing.SystemColors.ControlLight
        Me.lblHTP4.Font = New System.Drawing.Font("Consolas", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHTP4.Location = New System.Drawing.Point(94, 24)
        Me.lblHTP4.Name = "lblHTP4"
        Me.lblHTP4.Size = New System.Drawing.Size(306, 114)
        Me.lblHTP4.TabIndex = 13
        Me.lblHTP4.Text = "You will receive hints indicating" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "the number of colors in your" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "guess were corre" & _
            "ct by ""o""s" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "and the number of guesses" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "that were correct in both " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "color and pos" & _
            "ition by ""x""s" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        '
        'pbxHTP3
        '
        Me.pbxHTP3.BackgroundImage = Global.pro_MM.My.Resources.Resources.answers
        Me.pbxHTP3.Image = Global.pro_MM.My.Resources.Resources.guessesleft
        Me.pbxHTP3.Location = New System.Drawing.Point(180, 337)
        Me.pbxHTP3.Name = "pbxHTP3"
        Me.pbxHTP3.Size = New System.Drawing.Size(163, 31)
        Me.pbxHTP3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pbxHTP3.TabIndex = 14
        Me.pbxHTP3.TabStop = False
        '
        'lblHTP5
        '
        Me.lblHTP5.AutoSize = True
        Me.lblHTP5.BackColor = System.Drawing.SystemColors.ControlLight
        Me.lblHTP5.Font = New System.Drawing.Font("Consolas", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHTP5.Location = New System.Drawing.Point(110, 315)
        Me.lblHTP5.Name = "lblHTP5"
        Me.lblHTP5.Size = New System.Drawing.Size(333, 19)
        Me.lblHTP5.TabIndex = 15
        Me.lblHTP5.Text = "You have 10 tries to crack the code." & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        '
        'PlayToolStripMenuItem
        '
        Me.PlayToolStripMenuItem.Name = "PlayToolStripMenuItem"
        Me.PlayToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.PlayToolStripMenuItem.Text = "Play"
        '
        'btnPlay
        '
        Me.btnPlay.BackColor = System.Drawing.SystemColors.ControlLight
        Me.btnPlay.Font = New System.Drawing.Font("Constantia", 36.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnPlay.ForeColor = System.Drawing.SystemColors.ControlDarkDark
        Me.btnPlay.Location = New System.Drawing.Point(140, 406)
        Me.btnPlay.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnPlay.Name = "btnPlay"
        Me.btnPlay.Size = New System.Drawing.Size(233, 72)
        Me.btnPlay.TabIndex = 16
        Me.btnPlay.Text = "PLAY"
        Me.btnPlay.UseVisualStyleBackColor = False
        '
        'Instructions1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.pro_MM.My.Resources.Resources.vault_background
        Me.ClientSize = New System.Drawing.Size(539, 532)
        Me.Controls.Add(Me.btnPlay)
        Me.Controls.Add(Me.lblHTP5)
        Me.Controls.Add(Me.pbxHTP3)
        Me.Controls.Add(Me.lblHTP4)
        Me.Controls.Add(Me.btnBAHowPlay1)
        Me.Controls.Add(Me.MenuStrip1)
        Me.Name = "Instructions1"
        Me.Text = "Instructions"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        CType(Me.pbxHTP3, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents MenuToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HomeToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HighscoresToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents QuitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents btnBAHowPlay1 As System.Windows.Forms.Button
    Friend WithEvents lblHTP4 As System.Windows.Forms.Label
    Friend WithEvents pbxHTP3 As System.Windows.Forms.PictureBox
    Friend WithEvents lblHTP5 As System.Windows.Forms.Label
    Friend WithEvents PlayToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents btnPlay As System.Windows.Forms.Button
End Class

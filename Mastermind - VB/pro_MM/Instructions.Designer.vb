<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Instructions
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
        Me.lblHowtoPlay = New System.Windows.Forms.Label
        Me.btnBAHowPlay = New System.Windows.Forms.Button
        Me.btnFAHowPlay = New System.Windows.Forms.Button
        Me.lblHTP1 = New System.Windows.Forms.Label
        Me.pbxHTP1 = New System.Windows.Forms.PictureBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.pbxHTP2 = New System.Windows.Forms.PictureBox
        Me.lblHTP3 = New System.Windows.Forms.Label
        Me.PlayToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.MenuStrip1.SuspendLayout()
        CType(Me.pbxHTP1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.pbxHTP2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.MenuToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(539, 24)
        Me.MenuStrip1.TabIndex = 3
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'MenuToolStripMenuItem
        '
        Me.MenuToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.HomeToolStripMenuItem, Me.PlayToolStripMenuItem, Me.HighscoresToolStripMenuItem, Me.QuitToolStripMenuItem})
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
        'lblHowtoPlay
        '
        Me.lblHowtoPlay.AutoSize = True
        Me.lblHowtoPlay.BackColor = System.Drawing.Color.Transparent
        Me.lblHowtoPlay.Font = New System.Drawing.Font("Consolas", 27.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHowtoPlay.Location = New System.Drawing.Point(137, 24)
        Me.lblHowtoPlay.Name = "lblHowtoPlay"
        Me.lblHowtoPlay.Size = New System.Drawing.Size(239, 43)
        Me.lblHowtoPlay.TabIndex = 4
        Me.lblHowtoPlay.Text = "HOW TO PLAY"
        '
        'btnBAHowPlay
        '
        Me.btnBAHowPlay.BackgroundImage = Global.pro_MM.My.Resources.Resources.back_arrow_key
        Me.btnBAHowPlay.Location = New System.Drawing.Point(12, 27)
        Me.btnBAHowPlay.Name = "btnBAHowPlay"
        Me.btnBAHowPlay.Size = New System.Drawing.Size(62, 69)
        Me.btnBAHowPlay.TabIndex = 5
        Me.btnBAHowPlay.UseVisualStyleBackColor = True
        '
        'btnFAHowPlay
        '
        Me.btnFAHowPlay.BackgroundImage = Global.pro_MM.My.Resources.Resources.forward_arrow_key
        Me.btnFAHowPlay.Location = New System.Drawing.Point(449, 448)
        Me.btnFAHowPlay.Name = "btnFAHowPlay"
        Me.btnFAHowPlay.Size = New System.Drawing.Size(78, 72)
        Me.btnFAHowPlay.TabIndex = 6
        Me.btnFAHowPlay.UseVisualStyleBackColor = True
        '
        'lblHTP1
        '
        Me.lblHTP1.AutoSize = True
        Me.lblHTP1.BackColor = System.Drawing.SystemColors.ControlLight
        Me.lblHTP1.Font = New System.Drawing.Font("Consolas", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHTP1.Location = New System.Drawing.Point(12, 99)
        Me.lblHTP1.Name = "lblHTP1"
        Me.lblHTP1.Size = New System.Drawing.Size(369, 38)
        Me.lblHTP1.TabIndex = 8
        Me.lblHTP1.Text = "The objective of this game is to " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "crack the hidden code by logical guesses"
        '
        'pbxHTP1
        '
        Me.pbxHTP1.BackgroundImage = Global.pro_MM.My.Resources.Resources.answers
        Me.pbxHTP1.Image = Global.pro_MM.My.Resources.Resources.answers
        Me.pbxHTP1.Location = New System.Drawing.Point(387, 82)
        Me.pbxHTP1.Name = "pbxHTP1"
        Me.pbxHTP1.Size = New System.Drawing.Size(140, 74)
        Me.pbxHTP1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pbxHTP1.TabIndex = 9
        Me.pbxHTP1.TabStop = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.SystemColors.ControlLight
        Me.Label1.Font = New System.Drawing.Font("Consolas", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(174, 200)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(180, 76)
        Me.Label1.TabIndex = 10
        Me.Label1.Text = "To create a" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & " guess combination," & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & " you must " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "select a slot"
        '
        'pbxHTP2
        '
        Me.pbxHTP2.BackgroundImage = Global.pro_MM.My.Resources.Resources.firstselectbtn
        Me.pbxHTP2.Image = Global.pro_MM.My.Resources.Resources.thenhitguess1
        Me.pbxHTP2.Location = New System.Drawing.Point(16, 266)
        Me.pbxHTP2.Name = "pbxHTP2"
        Me.pbxHTP2.Size = New System.Drawing.Size(450, 176)
        Me.pbxHTP2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pbxHTP2.TabIndex = 11
        Me.pbxHTP2.TabStop = False
        '
        'lblHTP3
        '
        Me.lblHTP3.AutoSize = True
        Me.lblHTP3.BackColor = System.Drawing.SystemColors.ControlLight
        Me.lblHTP3.Font = New System.Drawing.Font("Consolas", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHTP3.Location = New System.Drawing.Point(21, 432)
        Me.lblHTP3.Name = "lblHTP3"
        Me.lblHTP3.Size = New System.Drawing.Size(360, 19)
        Me.lblHTP3.TabIndex = 12
        Me.lblHTP3.Text = "Then select a color, and click ""Guess""."
        '
        'PlayToolStripMenuItem
        '
        Me.PlayToolStripMenuItem.Name = "PlayToolStripMenuItem"
        Me.PlayToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.PlayToolStripMenuItem.Text = "Play"
        '
        'Instructions
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.pro_MM.My.Resources.Resources.vault_background
        Me.ClientSize = New System.Drawing.Size(539, 532)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.lblHTP3)
        Me.Controls.Add(Me.pbxHTP2)
        Me.Controls.Add(Me.pbxHTP1)
        Me.Controls.Add(Me.lblHTP1)
        Me.Controls.Add(Me.btnFAHowPlay)
        Me.Controls.Add(Me.btnBAHowPlay)
        Me.Controls.Add(Me.lblHowtoPlay)
        Me.Controls.Add(Me.MenuStrip1)
        Me.Name = "Instructions"
        Me.Text = "Instructions"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        CType(Me.pbxHTP1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.pbxHTP2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents MenuToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HomeToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HighscoresToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents QuitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents lblHowtoPlay As System.Windows.Forms.Label
    Friend WithEvents btnBAHowPlay As System.Windows.Forms.Button
    Friend WithEvents btnFAHowPlay As System.Windows.Forms.Button
    Friend WithEvents lblHTP1 As System.Windows.Forms.Label
    Friend WithEvents pbxHTP1 As System.Windows.Forms.PictureBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents pbxHTP2 As System.Windows.Forms.PictureBox
    Friend WithEvents lblHTP3 As System.Windows.Forms.Label
    Friend WithEvents PlayToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
End Class

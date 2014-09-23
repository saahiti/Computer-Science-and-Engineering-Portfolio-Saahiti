<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Play
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
        Me.lblCode = New System.Windows.Forms.Label
        Me.btnSelectColor1 = New System.Windows.Forms.Button
        Me.btnSelectColor2 = New System.Windows.Forms.Button
        Me.btnSelectColor3 = New System.Windows.Forms.Button
        Me.btnSelectColor4 = New System.Windows.Forms.Button
        Me.btnSelectColor5 = New System.Windows.Forms.Button
        Me.btnSelectColor6 = New System.Windows.Forms.Button
        Me.lblGuess = New System.Windows.Forms.Label
        Me.GrpBxSelectColor = New System.Windows.Forms.GroupBox
        Me.lblTitle = New System.Windows.Forms.Label
        Me.rad1 = New System.Windows.Forms.RadioButton
        Me.rad2 = New System.Windows.Forms.RadioButton
        Me.rad3 = New System.Windows.Forms.RadioButton
        Me.rad4 = New System.Windows.Forms.RadioButton
        Me.btnGuess = New System.Windows.Forms.Button
        Me.lblHints = New System.Windows.Forms.Label
        Me.lblGuessNumber = New System.Windows.Forms.Label
        Me.lblGuessesLeft = New System.Windows.Forms.Label
        Me.btnNewGame = New System.Windows.Forms.Button
        Me.btnBAGame = New System.Windows.Forms.Button
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip
        Me.MenuToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.HomeToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.HowToPlayToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.HighscoresToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.QuitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.picSelection1 = New System.Windows.Forms.PictureBox
        Me.picSelection2 = New System.Windows.Forms.PictureBox
        Me.picSelection4 = New System.Windows.Forms.PictureBox
        Me.picSelection3 = New System.Windows.Forms.PictureBox
        Me.PictureBox1 = New System.Windows.Forms.PictureBox
        Me.PictureBox2 = New System.Windows.Forms.PictureBox
        Me.PictureBox3 = New System.Windows.Forms.PictureBox
        Me.PictureBox4 = New System.Windows.Forms.PictureBox
        Me.lblAnswer = New System.Windows.Forms.Label
        Me.GrpBxSelectColor.SuspendLayout()
        Me.MenuStrip1.SuspendLayout()
        CType(Me.picSelection1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picSelection2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picSelection4, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picSelection3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox4, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'lblCode
        '
        Me.lblCode.AllowDrop = True
        Me.lblCode.Font = New System.Drawing.Font("Comic Sans MS", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCode.Location = New System.Drawing.Point(457, 215)
        Me.lblCode.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblCode.Name = "lblCode"
        Me.lblCode.Size = New System.Drawing.Size(54, 35)
        Me.lblCode.TabIndex = 0
        Me.lblCode.Text = "Code:"
        '
        'btnSelectColor1
        '
        Me.btnSelectColor1.Location = New System.Drawing.Point(13, 23)
        Me.btnSelectColor1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnSelectColor1.Name = "btnSelectColor1"
        Me.btnSelectColor1.Size = New System.Drawing.Size(46, 34)
        Me.btnSelectColor1.TabIndex = 5
        Me.btnSelectColor1.Tag = "1"
        Me.btnSelectColor1.Text = "1"
        Me.btnSelectColor1.UseVisualStyleBackColor = True
        '
        'btnSelectColor2
        '
        Me.btnSelectColor2.Location = New System.Drawing.Point(63, 23)
        Me.btnSelectColor2.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnSelectColor2.Name = "btnSelectColor2"
        Me.btnSelectColor2.Size = New System.Drawing.Size(46, 34)
        Me.btnSelectColor2.TabIndex = 6
        Me.btnSelectColor2.Tag = "2"
        Me.btnSelectColor2.Text = "2"
        Me.btnSelectColor2.UseVisualStyleBackColor = True
        '
        'btnSelectColor3
        '
        Me.btnSelectColor3.Location = New System.Drawing.Point(113, 23)
        Me.btnSelectColor3.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnSelectColor3.Name = "btnSelectColor3"
        Me.btnSelectColor3.Size = New System.Drawing.Size(46, 34)
        Me.btnSelectColor3.TabIndex = 7
        Me.btnSelectColor3.Tag = "3"
        Me.btnSelectColor3.Text = "3"
        Me.btnSelectColor3.UseVisualStyleBackColor = True
        '
        'btnSelectColor4
        '
        Me.btnSelectColor4.Location = New System.Drawing.Point(163, 23)
        Me.btnSelectColor4.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnSelectColor4.Name = "btnSelectColor4"
        Me.btnSelectColor4.Size = New System.Drawing.Size(46, 34)
        Me.btnSelectColor4.TabIndex = 8
        Me.btnSelectColor4.Tag = "4"
        Me.btnSelectColor4.Text = "4"
        Me.btnSelectColor4.UseVisualStyleBackColor = True
        '
        'btnSelectColor5
        '
        Me.btnSelectColor5.Location = New System.Drawing.Point(213, 23)
        Me.btnSelectColor5.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnSelectColor5.Name = "btnSelectColor5"
        Me.btnSelectColor5.Size = New System.Drawing.Size(46, 34)
        Me.btnSelectColor5.TabIndex = 9
        Me.btnSelectColor5.Tag = "5"
        Me.btnSelectColor5.Text = "5"
        Me.btnSelectColor5.UseVisualStyleBackColor = True
        '
        'btnSelectColor6
        '
        Me.btnSelectColor6.Location = New System.Drawing.Point(262, 23)
        Me.btnSelectColor6.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnSelectColor6.Name = "btnSelectColor6"
        Me.btnSelectColor6.Size = New System.Drawing.Size(46, 34)
        Me.btnSelectColor6.TabIndex = 10
        Me.btnSelectColor6.Tag = "6"
        Me.btnSelectColor6.Text = "6"
        Me.btnSelectColor6.UseVisualStyleBackColor = True
        '
        'lblGuess
        '
        Me.lblGuess.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGuess.Location = New System.Drawing.Point(434, 192)
        Me.lblGuess.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblGuess.Name = "lblGuess"
        Me.lblGuess.Size = New System.Drawing.Size(77, 23)
        Me.lblGuess.TabIndex = 11
        Me.lblGuess.Text = "Guess: "
        '
        'GrpBxSelectColor
        '
        Me.GrpBxSelectColor.BackColor = System.Drawing.Color.Transparent
        Me.GrpBxSelectColor.Controls.Add(Me.btnSelectColor1)
        Me.GrpBxSelectColor.Controls.Add(Me.btnSelectColor6)
        Me.GrpBxSelectColor.Controls.Add(Me.btnSelectColor2)
        Me.GrpBxSelectColor.Controls.Add(Me.btnSelectColor5)
        Me.GrpBxSelectColor.Controls.Add(Me.btnSelectColor4)
        Me.GrpBxSelectColor.Controls.Add(Me.btnSelectColor3)
        Me.GrpBxSelectColor.Font = New System.Drawing.Font("Consolas", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GrpBxSelectColor.Location = New System.Drawing.Point(89, 41)
        Me.GrpBxSelectColor.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.GrpBxSelectColor.Name = "GrpBxSelectColor"
        Me.GrpBxSelectColor.Padding = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.GrpBxSelectColor.Size = New System.Drawing.Size(324, 63)
        Me.GrpBxSelectColor.TabIndex = 22
        Me.GrpBxSelectColor.TabStop = False
        Me.GrpBxSelectColor.Text = "Colours"
        '
        'lblTitle
        '
        Me.lblTitle.AutoSize = True
        Me.lblTitle.BackColor = System.Drawing.Color.Transparent
        Me.lblTitle.Font = New System.Drawing.Font("Consolas", 24.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTitle.Location = New System.Drawing.Point(150, 26)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(197, 37)
        Me.lblTitle.TabIndex = 33
        Me.lblTitle.Text = "MASTERMIND"
        '
        'rad1
        '
        Me.rad1.AutoSize = True
        Me.rad1.BackColor = System.Drawing.Color.Transparent
        Me.rad1.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad1.Location = New System.Drawing.Point(158, 124)
        Me.rad1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad1.Name = "rad1"
        Me.rad1.Size = New System.Drawing.Size(14, 13)
        Me.rad1.TabIndex = 23
        Me.rad1.TabStop = True
        Me.rad1.Tag = "1"
        Me.rad1.UseVisualStyleBackColor = False
        '
        'rad2
        '
        Me.rad2.AutoSize = True
        Me.rad2.BackColor = System.Drawing.Color.Transparent
        Me.rad2.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad2.Location = New System.Drawing.Point(212, 124)
        Me.rad2.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad2.Name = "rad2"
        Me.rad2.Size = New System.Drawing.Size(14, 13)
        Me.rad2.TabIndex = 1
        Me.rad2.TabStop = True
        Me.rad2.Tag = "2"
        Me.rad2.UseVisualStyleBackColor = False
        '
        'rad3
        '
        Me.rad3.AutoSize = True
        Me.rad3.BackColor = System.Drawing.Color.Transparent
        Me.rad3.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad3.Location = New System.Drawing.Point(262, 124)
        Me.rad3.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad3.Name = "rad3"
        Me.rad3.Size = New System.Drawing.Size(14, 13)
        Me.rad3.TabIndex = 2
        Me.rad3.TabStop = True
        Me.rad3.Tag = "3"
        Me.rad3.UseVisualStyleBackColor = False
        '
        'rad4
        '
        Me.rad4.AutoSize = True
        Me.rad4.BackColor = System.Drawing.Color.Transparent
        Me.rad4.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad4.Location = New System.Drawing.Point(314, 124)
        Me.rad4.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad4.Name = "rad4"
        Me.rad4.Size = New System.Drawing.Size(14, 13)
        Me.rad4.TabIndex = 3
        Me.rad4.TabStop = True
        Me.rad4.Tag = "4"
        Me.rad4.UseVisualStyleBackColor = False
        '
        'btnGuess
        '
        Me.btnGuess.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.btnGuess.Font = New System.Drawing.Font("Consolas", 15.75!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnGuess.ForeColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.btnGuess.Location = New System.Drawing.Point(417, 41)
        Me.btnGuess.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnGuess.Name = "btnGuess"
        Me.btnGuess.Size = New System.Drawing.Size(111, 58)
        Me.btnGuess.TabIndex = 0
        Me.btnGuess.Text = "Guess!"
        Me.btnGuess.UseVisualStyleBackColor = False
        '
        'lblHints
        '
        Me.lblHints.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHints.Location = New System.Drawing.Point(445, 234)
        Me.lblHints.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblHints.Name = "lblHints"
        Me.lblHints.Size = New System.Drawing.Size(83, 30)
        Me.lblHints.TabIndex = 24
        Me.lblHints.Text = "Hints: "
        '
        'lblGuessNumber
        '
        Me.lblGuessNumber.BackColor = System.Drawing.Color.DimGray
        Me.lblGuessNumber.Font = New System.Drawing.Font("Impact", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGuessNumber.Location = New System.Drawing.Point(5, 195)
        Me.lblGuessNumber.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblGuessNumber.Name = "lblGuessNumber"
        Me.lblGuessNumber.Size = New System.Drawing.Size(25, 25)
        Me.lblGuessNumber.TabIndex = 25
        Me.lblGuessNumber.Text = "#"
        Me.lblGuessNumber.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblGuessesLeft
        '
        Me.lblGuessesLeft.BackColor = System.Drawing.Color.DimGray
        Me.lblGuessesLeft.Font = New System.Drawing.Font("Constantia", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGuessesLeft.ForeColor = System.Drawing.Color.White
        Me.lblGuessesLeft.Location = New System.Drawing.Point(180, 197)
        Me.lblGuessesLeft.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblGuessesLeft.Name = "lblGuessesLeft"
        Me.lblGuessesLeft.Size = New System.Drawing.Size(163, 25)
        Me.lblGuessesLeft.TabIndex = 26
        Me.lblGuessesLeft.Text = "Guesses Left: 10"
        '
        'btnNewGame
        '
        Me.btnNewGame.BackColor = System.Drawing.SystemColors.ControlDark
        Me.btnNewGame.Font = New System.Drawing.Font("Consolas", 14.25!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnNewGame.Location = New System.Drawing.Point(417, 108)
        Me.btnNewGame.Name = "btnNewGame"
        Me.btnNewGame.Size = New System.Drawing.Size(109, 43)
        Me.btnNewGame.TabIndex = 32
        Me.btnNewGame.Text = "New Game"
        Me.btnNewGame.UseVisualStyleBackColor = False
        '
        'btnBAGame
        '
        Me.btnBAGame.Image = Global.pro_MM.My.Resources.Resources.back_arrow_key
        Me.btnBAGame.Location = New System.Drawing.Point(21, 27)
        Me.btnBAGame.Name = "btnBAGame"
        Me.btnBAGame.Size = New System.Drawing.Size(63, 72)
        Me.btnBAGame.TabIndex = 34
        Me.btnBAGame.UseVisualStyleBackColor = True
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.MenuToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(539, 24)
        Me.MenuStrip1.TabIndex = 35
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'MenuToolStripMenuItem
        '
        Me.MenuToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.HomeToolStripMenuItem, Me.HowToPlayToolStripMenuItem, Me.HighscoresToolStripMenuItem, Me.QuitToolStripMenuItem})
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
        'HowToPlayToolStripMenuItem
        '
        Me.HowToPlayToolStripMenuItem.Name = "HowToPlayToolStripMenuItem"
        Me.HowToPlayToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.HowToPlayToolStripMenuItem.Text = "How To Play"
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
        'picSelection1
        '
        Me.picSelection1.Location = New System.Drawing.Point(141, 107)
        Me.picSelection1.Name = "picSelection1"
        Me.picSelection1.Size = New System.Drawing.Size(46, 44)
        Me.picSelection1.TabIndex = 40
        Me.picSelection1.TabStop = False
        '
        'picSelection2
        '
        Me.picSelection2.Location = New System.Drawing.Point(193, 107)
        Me.picSelection2.Name = "picSelection2"
        Me.picSelection2.Size = New System.Drawing.Size(46, 44)
        Me.picSelection2.TabIndex = 41
        Me.picSelection2.TabStop = False
        '
        'picSelection4
        '
        Me.picSelection4.Location = New System.Drawing.Point(297, 107)
        Me.picSelection4.Name = "picSelection4"
        Me.picSelection4.Size = New System.Drawing.Size(46, 44)
        Me.picSelection4.TabIndex = 42
        Me.picSelection4.TabStop = False
        '
        'picSelection3
        '
        Me.picSelection3.Location = New System.Drawing.Point(245, 107)
        Me.picSelection3.Name = "picSelection3"
        Me.picSelection3.Size = New System.Drawing.Size(46, 44)
        Me.picSelection3.TabIndex = 43
        Me.picSelection3.TabStop = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(141, 150)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(46, 44)
        Me.PictureBox1.TabIndex = 44
        Me.PictureBox1.TabStop = False
        Me.PictureBox1.Visible = False
        '
        'PictureBox2
        '
        Me.PictureBox2.Location = New System.Drawing.Point(193, 150)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(46, 44)
        Me.PictureBox2.TabIndex = 45
        Me.PictureBox2.TabStop = False
        Me.PictureBox2.Visible = False
        '
        'PictureBox3
        '
        Me.PictureBox3.Location = New System.Drawing.Point(245, 150)
        Me.PictureBox3.Name = "PictureBox3"
        Me.PictureBox3.Size = New System.Drawing.Size(46, 44)
        Me.PictureBox3.TabIndex = 47
        Me.PictureBox3.TabStop = False
        Me.PictureBox3.Visible = False
        '
        'PictureBox4
        '
        Me.PictureBox4.Location = New System.Drawing.Point(297, 150)
        Me.PictureBox4.Name = "PictureBox4"
        Me.PictureBox4.Size = New System.Drawing.Size(46, 44)
        Me.PictureBox4.TabIndex = 46
        Me.PictureBox4.TabStop = False
        Me.PictureBox4.Visible = False
        '
        'lblAnswer
        '
        Me.lblAnswer.BackColor = System.Drawing.Color.DimGray
        Me.lblAnswer.Font = New System.Drawing.Font("Constantia", 21.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblAnswer.ForeColor = System.Drawing.Color.White
        Me.lblAnswer.Location = New System.Drawing.Point(141, 107)
        Me.lblAnswer.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblAnswer.Name = "lblAnswer"
        Me.lblAnswer.Size = New System.Drawing.Size(202, 44)
        Me.lblAnswer.TabIndex = 48
        Me.lblAnswer.Text = "ANSWER:"
        Me.lblAnswer.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        Me.lblAnswer.Visible = False
        '
        'Play
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.pro_MM.My.Resources.Resources.vault_background
        Me.ClientSize = New System.Drawing.Size(539, 532)
        Me.Controls.Add(Me.lblAnswer)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox3)
        Me.Controls.Add(Me.PictureBox4)
        Me.Controls.Add(Me.MenuStrip1)
        Me.Controls.Add(Me.lblTitle)
        Me.Controls.Add(Me.btnBAGame)
        Me.Controls.Add(Me.btnNewGame)
        Me.Controls.Add(Me.lblGuessesLeft)
        Me.Controls.Add(Me.lblGuessNumber)
        Me.Controls.Add(Me.lblHints)
        Me.Controls.Add(Me.btnGuess)
        Me.Controls.Add(Me.rad4)
        Me.Controls.Add(Me.rad3)
        Me.Controls.Add(Me.rad2)
        Me.Controls.Add(Me.rad1)
        Me.Controls.Add(Me.GrpBxSelectColor)
        Me.Controls.Add(Me.lblGuess)
        Me.Controls.Add(Me.lblCode)
        Me.Controls.Add(Me.picSelection1)
        Me.Controls.Add(Me.picSelection2)
        Me.Controls.Add(Me.picSelection3)
        Me.Controls.Add(Me.picSelection4)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.Name = "Play"
        Me.Text = "Mastermind!"
        Me.GrpBxSelectColor.ResumeLayout(False)
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        CType(Me.picSelection1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picSelection2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picSelection4, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picSelection3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox4, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblCode As System.Windows.Forms.Label
    Friend WithEvents btnSelectColor1 As System.Windows.Forms.Button
    Friend WithEvents btnSelectColor2 As System.Windows.Forms.Button
    Friend WithEvents btnSelectColor3 As System.Windows.Forms.Button
    Friend WithEvents btnSelectColor4 As System.Windows.Forms.Button
    Friend WithEvents btnSelectColor5 As System.Windows.Forms.Button
    Friend WithEvents btnSelectColor6 As System.Windows.Forms.Button
    Friend WithEvents lblGuess As System.Windows.Forms.Label
    Friend WithEvents GrpBxSelectColor As System.Windows.Forms.GroupBox
    Friend WithEvents rad1 As System.Windows.Forms.RadioButton
    Friend WithEvents rad2 As System.Windows.Forms.RadioButton
    Friend WithEvents rad3 As System.Windows.Forms.RadioButton
    Friend WithEvents rad4 As System.Windows.Forms.RadioButton
    Friend WithEvents btnGuess As System.Windows.Forms.Button
    Friend WithEvents lblHints As System.Windows.Forms.Label
    Friend WithEvents lblGuessNumber As System.Windows.Forms.Label
    Friend WithEvents lblGuessesLeft As System.Windows.Forms.Label
    Friend WithEvents btnNewGame As System.Windows.Forms.Button
    Friend WithEvents lblTitle As System.Windows.Forms.Label
    Friend WithEvents btnBAGame As System.Windows.Forms.Button
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents MenuToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HomeToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HowToPlayToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HighscoresToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents QuitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents picSelection1 As System.Windows.Forms.PictureBox
    Friend WithEvents picSelection2 As System.Windows.Forms.PictureBox
    Friend WithEvents picSelection4 As System.Windows.Forms.PictureBox
    Friend WithEvents picSelection3 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox3 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox4 As System.Windows.Forms.PictureBox
    Friend WithEvents lblAnswer As System.Windows.Forms.Label

End Class

<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class game
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
        Me.btn1 = New System.Windows.Forms.Button
        Me.btn2 = New System.Windows.Forms.Button
        Me.btn3 = New System.Windows.Forms.Button
        Me.btn4 = New System.Windows.Forms.Button
        Me.btn5 = New System.Windows.Forms.Button
        Me.btn6 = New System.Windows.Forms.Button
        Me.lblGuess = New System.Windows.Forms.Label
        Me.pic4 = New System.Windows.Forms.PictureBox
        Me.pic3 = New System.Windows.Forms.PictureBox
        Me.pic2 = New System.Windows.Forms.PictureBox
        Me.pic1 = New System.Windows.Forms.PictureBox
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.rad1 = New System.Windows.Forms.RadioButton
        Me.rad2 = New System.Windows.Forms.RadioButton
        Me.rad3 = New System.Windows.Forms.RadioButton
        Me.rad4 = New System.Windows.Forms.RadioButton
        Me.btnGuess = New System.Windows.Forms.Button
        Me.lblHints = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.lblNumGuesses = New System.Windows.Forms.Label
        Me.PictureBox1 = New System.Windows.Forms.PictureBox
        Me.PictureBox2 = New System.Windows.Forms.PictureBox
        Me.PictureBox3 = New System.Windows.Forms.PictureBox
        Me.PictureBox4 = New System.Windows.Forms.PictureBox
        Me.btnNewGame = New System.Windows.Forms.Button
        Me.lblTitle = New System.Windows.Forms.Label
        Me.btnBAGame = New System.Windows.Forms.Button
        CType(Me.pic4, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.pic3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.pic2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.pic1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
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
        Me.lblCode.Location = New System.Drawing.Point(268, 66)
        Me.lblCode.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblCode.Name = "lblCode"
        Me.lblCode.Size = New System.Drawing.Size(54, 27)
        Me.lblCode.TabIndex = 0
        Me.lblCode.Text = "Code:"
        '
        'btn1
        '
        Me.btn1.Location = New System.Drawing.Point(16, 46)
        Me.btn1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btn1.Name = "btn1"
        Me.btn1.Size = New System.Drawing.Size(46, 34)
        Me.btn1.TabIndex = 5
        Me.btn1.Tag = "1"
        Me.btn1.Text = "1"
        Me.btn1.UseVisualStyleBackColor = True
        '
        'btn2
        '
        Me.btn2.Location = New System.Drawing.Point(16, 100)
        Me.btn2.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btn2.Name = "btn2"
        Me.btn2.Size = New System.Drawing.Size(46, 34)
        Me.btn2.TabIndex = 6
        Me.btn2.Tag = "2"
        Me.btn2.Text = "2"
        Me.btn2.UseVisualStyleBackColor = True
        '
        'btn3
        '
        Me.btn3.Location = New System.Drawing.Point(16, 150)
        Me.btn3.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btn3.Name = "btn3"
        Me.btn3.Size = New System.Drawing.Size(46, 34)
        Me.btn3.TabIndex = 7
        Me.btn3.Tag = "3"
        Me.btn3.Text = "3"
        Me.btn3.UseVisualStyleBackColor = True
        '
        'btn4
        '
        Me.btn4.Location = New System.Drawing.Point(16, 208)
        Me.btn4.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btn4.Name = "btn4"
        Me.btn4.Size = New System.Drawing.Size(46, 34)
        Me.btn4.TabIndex = 8
        Me.btn4.Tag = "4"
        Me.btn4.Text = "4"
        Me.btn4.UseVisualStyleBackColor = True
        '
        'btn5
        '
        Me.btn5.Location = New System.Drawing.Point(16, 263)
        Me.btn5.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btn5.Name = "btn5"
        Me.btn5.Size = New System.Drawing.Size(46, 34)
        Me.btn5.TabIndex = 9
        Me.btn5.Tag = "5"
        Me.btn5.Text = "5"
        Me.btn5.UseVisualStyleBackColor = True
        '
        'btn6
        '
        Me.btn6.Location = New System.Drawing.Point(16, 317)
        Me.btn6.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btn6.Name = "btn6"
        Me.btn6.Size = New System.Drawing.Size(46, 34)
        Me.btn6.TabIndex = 10
        Me.btn6.Tag = "6"
        Me.btn6.Text = "6"
        Me.btn6.UseVisualStyleBackColor = True
        '
        'lblGuess
        '
        Me.lblGuess.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGuess.Location = New System.Drawing.Point(284, 281)
        Me.lblGuess.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblGuess.Name = "lblGuess"
        Me.lblGuess.Size = New System.Drawing.Size(77, 23)
        Me.lblGuess.TabIndex = 11
        Me.lblGuess.Text = "Guess: "
        '
        'pic4
        '
        Me.pic4.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.pic4.Location = New System.Drawing.Point(220, 112)
        Me.pic4.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.pic4.Name = "pic4"
        Me.pic4.Size = New System.Drawing.Size(46, 46)
        Me.pic4.TabIndex = 4
        Me.pic4.TabStop = False
        '
        'pic3
        '
        Me.pic3.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.pic3.Location = New System.Drawing.Point(168, 112)
        Me.pic3.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.pic3.Name = "pic3"
        Me.pic3.Size = New System.Drawing.Size(46, 46)
        Me.pic3.TabIndex = 3
        Me.pic3.TabStop = False
        Me.pic3.Tag = "4"
        '
        'pic2
        '
        Me.pic2.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.pic2.Location = New System.Drawing.Point(116, 112)
        Me.pic2.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.pic2.Name = "pic2"
        Me.pic2.Size = New System.Drawing.Size(46, 46)
        Me.pic2.TabIndex = 2
        Me.pic2.TabStop = False
        '
        'pic1
        '
        Me.pic1.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.pic1.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.pic1.Location = New System.Drawing.Point(64, 112)
        Me.pic1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.pic1.Name = "pic1"
        Me.pic1.Size = New System.Drawing.Size(46, 46)
        Me.pic1.TabIndex = 1
        Me.pic1.TabStop = False
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.btn1)
        Me.GroupBox1.Controls.Add(Me.btn6)
        Me.GroupBox1.Controls.Add(Me.btn2)
        Me.GroupBox1.Controls.Add(Me.btn5)
        Me.GroupBox1.Controls.Add(Me.btn4)
        Me.GroupBox1.Controls.Add(Me.btn3)
        Me.GroupBox1.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(390, 93)
        Me.GroupBox1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Padding = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.GroupBox1.Size = New System.Drawing.Size(89, 384)
        Me.GroupBox1.TabIndex = 22
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Colour Palette"
        '
        'rad1
        '
        Me.rad1.AutoSize = True
        Me.rad1.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad1.Location = New System.Drawing.Point(64, 164)
        Me.rad1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad1.Name = "rad1"
        Me.rad1.Size = New System.Drawing.Size(35, 19)
        Me.rad1.TabIndex = 23
        Me.rad1.TabStop = True
        Me.rad1.Tag = "1"
        Me.rad1.Text = "r1"
        Me.rad1.UseVisualStyleBackColor = True
        '
        'rad2
        '
        Me.rad2.AutoSize = True
        Me.rad2.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad2.Location = New System.Drawing.Point(118, 164)
        Me.rad2.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad2.Name = "rad2"
        Me.rad2.Size = New System.Drawing.Size(37, 19)
        Me.rad2.TabIndex = 1
        Me.rad2.TabStop = True
        Me.rad2.Tag = "2"
        Me.rad2.Text = "r2"
        Me.rad2.UseVisualStyleBackColor = True
        '
        'rad3
        '
        Me.rad3.AutoSize = True
        Me.rad3.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad3.Location = New System.Drawing.Point(168, 164)
        Me.rad3.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad3.Name = "rad3"
        Me.rad3.Size = New System.Drawing.Size(37, 19)
        Me.rad3.TabIndex = 2
        Me.rad3.TabStop = True
        Me.rad3.Tag = "3"
        Me.rad3.Text = "r3"
        Me.rad3.UseVisualStyleBackColor = True
        '
        'rad4
        '
        Me.rad4.AutoSize = True
        Me.rad4.Font = New System.Drawing.Font("Comic Sans MS", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rad4.Location = New System.Drawing.Point(220, 164)
        Me.rad4.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.rad4.Name = "rad4"
        Me.rad4.Size = New System.Drawing.Size(37, 19)
        Me.rad4.TabIndex = 3
        Me.rad4.TabStop = True
        Me.rad4.Tag = "4"
        Me.rad4.Text = "r4"
        Me.rad4.UseVisualStyleBackColor = True
        '
        'btnGuess
        '
        Me.btnGuess.BackColor = System.Drawing.Color.Navy
        Me.btnGuess.Font = New System.Drawing.Font("Consolas", 15.75!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnGuess.ForeColor = System.Drawing.SystemColors.Control
        Me.btnGuess.Location = New System.Drawing.Point(282, 112)
        Me.btnGuess.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.btnGuess.Name = "btnGuess"
        Me.btnGuess.Size = New System.Drawing.Size(97, 46)
        Me.btnGuess.TabIndex = 0
        Me.btnGuess.Text = "Guess!"
        Me.btnGuess.UseVisualStyleBackColor = False
        '
        'lblHints
        '
        Me.lblHints.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHints.Location = New System.Drawing.Point(284, 243)
        Me.lblHints.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblHints.Name = "lblHints"
        Me.lblHints.Size = New System.Drawing.Size(83, 22)
        Me.lblHints.TabIndex = 24
        Me.lblHints.Text = "Hints: "
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(284, 318)
        Me.Label4.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(62, 26)
        Me.Label4.TabIndex = 25
        Me.Label4.Text = "Label4"
        '
        'lblNumGuesses
        '
        Me.lblNumGuesses.Font = New System.Drawing.Font("Comic Sans MS", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblNumGuesses.Location = New System.Drawing.Point(284, 363)
        Me.lblNumGuesses.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.lblNumGuesses.Name = "lblNumGuesses"
        Me.lblNumGuesses.Size = New System.Drawing.Size(77, 39)
        Me.lblNumGuesses.TabIndex = 26
        Me.lblNumGuesses.Text = "Number of Guesses :"
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.PictureBox1.Location = New System.Drawing.Point(220, 456)
        Me.PictureBox1.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(46, 46)
        Me.PictureBox1.TabIndex = 31
        Me.PictureBox1.TabStop = False
        Me.PictureBox1.Visible = False
        '
        'PictureBox2
        '
        Me.PictureBox2.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.PictureBox2.Location = New System.Drawing.Point(168, 456)
        Me.PictureBox2.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(46, 46)
        Me.PictureBox2.TabIndex = 30
        Me.PictureBox2.TabStop = False
        Me.PictureBox2.Tag = "4"
        Me.PictureBox2.Visible = False
        '
        'PictureBox3
        '
        Me.PictureBox3.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.PictureBox3.Location = New System.Drawing.Point(116, 456)
        Me.PictureBox3.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.PictureBox3.Name = "PictureBox3"
        Me.PictureBox3.Size = New System.Drawing.Size(46, 46)
        Me.PictureBox3.TabIndex = 29
        Me.PictureBox3.TabStop = False
        Me.PictureBox3.Visible = False
        '
        'PictureBox4
        '
        Me.PictureBox4.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.PictureBox4.Image = Global.pro_MM.My.Resources.Resources.circle
        Me.PictureBox4.Location = New System.Drawing.Point(64, 456)
        Me.PictureBox4.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.PictureBox4.Name = "PictureBox4"
        Me.PictureBox4.Size = New System.Drawing.Size(46, 46)
        Me.PictureBox4.TabIndex = 28
        Me.PictureBox4.TabStop = False
        Me.PictureBox4.Visible = False
        '
        'btnNewGame
        '
        Me.btnNewGame.Font = New System.Drawing.Font("Comic Sans MS", 11.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnNewGame.Location = New System.Drawing.Point(287, 456)
        Me.btnNewGame.Name = "btnNewGame"
        Me.btnNewGame.Size = New System.Drawing.Size(98, 32)
        Me.btnNewGame.TabIndex = 32
        Me.btnNewGame.Text = "New Game"
        Me.btnNewGame.UseVisualStyleBackColor = True
        '
        'lblTitle
        '
        Me.lblTitle.AutoSize = True
        Me.lblTitle.BackColor = System.Drawing.Color.Transparent
        Me.lblTitle.Font = New System.Drawing.Font("Consolas", 27.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTitle.Location = New System.Drawing.Point(160, 23)
        Me.lblTitle.Name = "lblTitle"
        Me.lblTitle.Size = New System.Drawing.Size(219, 43)
        Me.lblTitle.TabIndex = 33
        Me.lblTitle.Text = "MASTERMIND"
        '
        'btnBAGame
        '
        Me.btnBAGame.Image = Global.pro_MM.My.Resources.Resources.back_arrow_key
        Me.btnBAGame.Location = New System.Drawing.Point(22, 21)
        Me.btnBAGame.Name = "btnBAGame"
        Me.btnBAGame.Size = New System.Drawing.Size(63, 72)
        Me.btnBAGame.TabIndex = 34
        Me.btnBAGame.UseVisualStyleBackColor = True
        '
        'proMM
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.pro_MM.My.Resources.Resources.vault_background
        Me.ClientSize = New System.Drawing.Size(539, 532)
        Me.Controls.Add(Me.btnBAGame)
        Me.Controls.Add(Me.lblTitle)
        Me.Controls.Add(Me.btnNewGame)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox3)
        Me.Controls.Add(Me.PictureBox4)
        Me.Controls.Add(Me.lblNumGuesses)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.lblHints)
        Me.Controls.Add(Me.btnGuess)
        Me.Controls.Add(Me.rad4)
        Me.Controls.Add(Me.rad3)
        Me.Controls.Add(Me.rad2)
        Me.Controls.Add(Me.rad1)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.lblGuess)
        Me.Controls.Add(Me.pic4)
        Me.Controls.Add(Me.pic3)
        Me.Controls.Add(Me.pic2)
        Me.Controls.Add(Me.pic1)
        Me.Controls.Add(Me.lblCode)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.Name = "proMM"
        Me.Text = "Mastermind!"
        CType(Me.pic4, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.pic3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.pic2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.pic1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox4, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblCode As System.Windows.Forms.Label
    Friend WithEvents pic1 As System.Windows.Forms.PictureBox
    Friend WithEvents pic2 As System.Windows.Forms.PictureBox
    Friend WithEvents pic3 As System.Windows.Forms.PictureBox
    Friend WithEvents pic4 As System.Windows.Forms.PictureBox
    Friend WithEvents btn1 As System.Windows.Forms.Button
    Friend WithEvents btn2 As System.Windows.Forms.Button
    Friend WithEvents btn3 As System.Windows.Forms.Button
    Friend WithEvents btn4 As System.Windows.Forms.Button
    Friend WithEvents btn5 As System.Windows.Forms.Button
    Friend WithEvents btn6 As System.Windows.Forms.Button
    Friend WithEvents lblGuess As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents rad1 As System.Windows.Forms.RadioButton
    Friend WithEvents rad2 As System.Windows.Forms.RadioButton
    Friend WithEvents rad3 As System.Windows.Forms.RadioButton
    Friend WithEvents rad4 As System.Windows.Forms.RadioButton
    Friend WithEvents btnGuess As System.Windows.Forms.Button
    Friend WithEvents lblHints As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents lblNumGuesses As System.Windows.Forms.Label
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox3 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox4 As System.Windows.Forms.PictureBox
    Friend WithEvents btnNewGame As System.Windows.Forms.Button
    Friend WithEvents lblTitle As System.Windows.Forms.Label
    Friend WithEvents btnBAGame As System.Windows.Forms.Button

End Class

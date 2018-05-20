using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Presentation
{
    public partial class UpdateClient : Form
    {
        private static int dni = 0;
        private static int nombres = 0;
        private static int apellidos = 0;

        public UpdateClient()
        {
			dni = nombres = apellidos = 0;
            InitializeComponent();
            this.CenterToScreen();
        }

        private void returnButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void UpdateClient_Load(object sender, EventArgs e)
        {

        }

        private void dniTextBox_TextChanged(object sender, EventArgs e)
        {
            if (dni == 0)
            {
                dniTextBox.Text = "";
                dniTextBox.ForeColor = Color.Black;
                dni++;
            }
        }

        private void dniTextBox_MouseClick(object sender, MouseEventArgs e)
        {
            if (dni == 0)
            {
                dniTextBox.Text = "";
            }
        }

        private void nameTextBox_TextChanged(object sender, EventArgs e)
        {
            if (nombres == 0)
            {
                nameTextBox.Text = "";
                nameTextBox.ForeColor = Color.Black;
                nombres++;
            }
        }

        private void nameTextBox_MouseClick(object sender, MouseEventArgs e)
        {
            if (nombres == 0)
            {
                nameTextBox.Text = "";
            }
        }

        private void lastnameTextBox_TextChanged(object sender, EventArgs e)
        {
            if (apellidos == 0)
            {
                lastnameTextBox.Text = "";
                lastnameTextBox.ForeColor = Color.Black;
                apellidos++;
            }
        }

        private void lastnameTextBox_MouseClick(object sender, MouseEventArgs e)
        {
            if (apellidos == 0)
            {
                lastnameTextBox.Text = "";
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            bool flag = false;
            if (dniTextBox.Text == "" && nameTextBox.Text == "" && lastnameTextBox.Text == "")
            {
                int i = 0;
                MessageBox.Show("Debe ingresar datos en algún campo para realizar la búsqueda", "Error de Búsqueda", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                string cad = dniTextBox.Text;
                while (i < cad.Length)
                {
                    if (cad[i] <= '0' && cad[i] >= '9') flag = true;
                }
            }
            else if(flag)
            {
                MessageBox.Show("Solo puede ingresar números como DNI", "Error de Búsqueda", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            {
                this.Size = new Size(819, 536);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using Irony.Ast;
using Irony.Parsing;

namespace Practica2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Gramatica gramatica = new Gramatica();
            Parser parser = new Parser(gramatica);

            ParseTree arbol = parser.Parse(this.txtentrada.Text);

            if (arbol.Root != null)
            {       //Ejecutar(arbol.Root);
                this.txtentrada.Text = "SE PUDO GENERAR ARBOL";
            }
            else
            {
                this.txtentrada.Text = "NO SE PUDO GENERAR ARBOL";
            }
        }
    }
}

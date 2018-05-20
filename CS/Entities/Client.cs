using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Entities
{
    public class Client:Entity
    {
        private int id;
        private string name;
        private int points;
        private string address;
        private int phoneNumber;

        public Client(int id, string name, int points, string address, int phoneNumber)
        {
            this.id = id;
            this.name = name;
            this.points = points;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        //getters y setters
        public int Id
        {
            get { return this.id; }
            set { this.id = value; }
        }
        public string Name
        {
            get { return this.name; }
            set { this.name = value; }
        }
        public int Points
        {
            get { return this.points; }
            set { this.points = value; }
        }
        public string Address
        {
            get { return this.address; }
            set { this.address = value; }
        }
        public int PhoneNumber
        {
            get { return this.phoneNumber; }
            set { this.phoneNumber = value; }
        }

        //Métodos
        public void addToBD()
        {

        }
        public void updateInBD()
        {

        }
        public void deleteInBD()
        {

        }

    }
}

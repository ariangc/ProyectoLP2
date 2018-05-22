using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DataStorage;

namespace Entities
{
    public class Client:Entity
    {
        private string name;
        private string surname;
        private string dni;
        private string district;
        private string phoneNumber;
        private string email;
        private int points;

        public Client()
        {

        }
        public Client(string name, string surname, string dni, string district, string phoneNumber, string email) {
            this.name = name; this.surname = surname; this.dni = dni; this.district = district;
            this.phoneNumber = phoneNumber; this.email = email;
        }

        public string Name { get => name; set => name = value; }
        public string Surname { get => surname; set => surname = value; }
        public string Dni { get => dni; set => dni = value; }
        public string District { get => district; set => district = value; }
        public string PhoneNumber { get => phoneNumber; set => phoneNumber = value; }
        public string Email { get => email; set => email = value; }
        public int Points { get => points; set => points = value; }

        public void addToBD() {
            BDManager bdm = BDManager.getInstance();
            List<Object> listParameters = new List<Object>();

            listParameters.Add((Object)name);
            listParameters.Add((Object)surname);
            listParameters.Add((Object)dni);
            listParameters.Add((Object)district);
            listParameters.Add((Object)phoneNumber);
            listParameters.Add((Object)email);
            Console.WriteLine(name + " " + surname + " " + dni + " " + phoneNumber + " " + email);
            bdm.AddUpdate("addToBDClient", listParameters);
        }

        public void deleteInBD() {

        }

        public void updateInBD() {

        }
    }
}

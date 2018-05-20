using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Entities
{
    public class Discount : Entity
    {
        private int clientPointsRequired;
        private string description;
        private int productId;
        private double newPrice;

        public Discount(int points, string description, int productId, double newPrice)
        {
            this.clientPointsRequired = points;
            this.description = description;
            this.productId = productId;
            this.newPrice = newPrice;
        }

        public int ClientPointsRequired
        {
            get
            {
                return clientPointsRequired;
            }

            set
            {
                clientPointsRequired = value;
            }
        }

        public string Description
        {
            get
            {
                return description;
            }

            set
            {
                description = value;
            }
        }

        public int ProductId
        {
            get
            {
                return productId;
            }

            set
            {
                productId = value;
            }
        }

        public double NewPrice
        {
            get
            {
                return newPrice;
            }

            set
            {
                newPrice = value;
            }
        }

        //Metodos
        public void addToBD()
        {

        }

        public void deleteInBD()
        {

        }

        public void updateInBD()
        {

        }
    }
}

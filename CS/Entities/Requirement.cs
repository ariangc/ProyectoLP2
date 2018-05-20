using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static Utils.Enumerators;

namespace Entities
{
    public class Requirement : Entity
    {
        //atributos
        private RequirementType type;
        private string description;

        public Requirement(RequirementType type, string description)
        {
            this.type = type;
            this.description = description;
        }

        //getters y setters
        private RequirementType Type
        {
            get
            {
                return type;
            }

            set
            {
                type = value;
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

        //Métodos
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

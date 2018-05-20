using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStorage{
    public class BDManager
    {
        private static BDManager dataBase;

        private BDManager()
        {

        }

        public static BDManager getInstance()
        {
            if (dataBase == null)
            {
                dataBase = new BDManager();
            }
            return dataBase;
        }

        public void setProcedure(string procedureName)
        {
            Console.WriteLine("Setting procedure " + procedureName + "...");
        }

        public void setParameters(List<string> parameters)
        {
            foreach (string parameter in parameters)
            {
                Console.WriteLine("Setting parameter " + parameter + "...");
            }
        }

        public List<string> executeProcedure()
        {
            Console.WriteLine("Executing...");
            return null;
        }


    }
}

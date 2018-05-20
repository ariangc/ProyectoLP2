using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static Utils.Enumerators;

namespace Entities{
	public class Sale : Transaction{
		
		public Sale(Product product, DateTime transactionDate, int productQuantity, DateTime expirationDate): base(product, transactionDate, productQuantity, expirationDate){
		}

		public override void addToBD(){

		}

		public override void updateInBD(){

		}

		public override void deleteInBD(){

		}

		public void consultSimilarProducts(){

		}

		public void consultDiscounts(){

		}

		private void lowStockWarning(){

		}

		private void needPrescriptionWarning(){

		}
	}
}

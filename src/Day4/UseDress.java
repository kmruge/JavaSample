package Day4;

public class UseDress {

	public static void main(String[] args) {
		Dress d=new Dress();
		d.name=(args[0]);
		d.material=(args[1]);
		d.color=(args[2]);
		d.price=Integer.parseInt(args[3]);
		d.taxamount=Integer.parseInt(args[4]);
		d.netprice=d.price*d.price-d.taxamount/100;
		d.isgood=Boolean.parseBoolean(args[5]);
		d.barCodeNo=Long.parseLong(args[6]);
		d.rating=Float.parseFloat(args[7]);
		System.out.println("name- "+d.name+"  material- "+d.material+"  color- "+d.color+"  isGood- "+d.isgood+"  barcode- "+d.barCodeNo+"  rating- "+d.rating);
	}

}

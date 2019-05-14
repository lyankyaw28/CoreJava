package main.abstractionAndInterface;

/*interface ဆိုတာ class တစ္ခုရဲ႕ blue print တစ္ခုၿဖစ္တယ္
 * static constants ေတြနဲ႔ abstract method မ်ားပါ၀င္တယ္
 * interface ဆိုတာ abstraction မ်ားကို ရယူဖုိ႔ mechanism တစ္ခုၿဖစ္တယ္
 * interface ထဲမွာဆိုရင္ေတာ့ method ေတြအကုန္လံုးက abstract method ေတြခ်ည္းပဲၿဖစ္တယ္
 * abstraction နဲ႔ multiple inheritance,loose coupling  ရရွိဖို႔ သံုးပါတယ္
 * interface ထဲမွာေၾကညာတဲ့ variable ေတြက public, static, final က default ပဲ
 * method ေတြဆိုရင္လည္း abstract မထည့္ထားေပမယ့္လည္း abstract method ေတြပဲ
 * 
 * The relationship between classes and interfaces
 * 		class to class -- extends
 * 		interface to class -- implements
 * 		interface to interface -- extends
 * 
 * Multiple inheritance in Java by interface
 * 		class တစ္ခုက interface အမ်ားၾကီးကို implements လုပ္လို႔ရသလို 
 * 		interface တစ္ခုက interface အမ်ားၾကီးကို extends လုပ္လို႔ရတယ္
 * 
 * 
 * important point(Difference between abstract class and interface)
 * 			abstract class ေရာ interface ေရာမွာ abstract method မ်ားကို အသံုးၿပဳႏိုင္ရန္သံုးတယ္
 * 			ႏွစ္ခုလံုးကို instantiated လုပ္လို႔မရဘူး
 * 
 * 			1.abstract မွာ abstract method ေရာ ရိုးရိုး method ေတြေရာပါရွိႏိုင္
 * 				interface မွာက abstract method ေတြပဲ ရွိမယ္ java 8 မွာၾကေတာ့ default method နဲ႔ static method 
 * 				မ်ားကိုလည္း သံုးႏုိင္လာတယ္
 * 			2.abstract က multiple inheritance ကို support မလုပ္ပါ
 * 				interface က multiple inheritance ကို support လုပ္တယ္
 * 			3.abstract class မွာက final,non-final,static နဲ႔ non-static variable ေတြရွိႏိုင္
 * 				interface မွာက final နဲ႔ static variable မ်ားသာရွိႏိုင္
 * 			4.abstract class ေတြက implementation of interface ကို ေပးႏိုင္တယ္
 * 				interface ေတြက implementation of abstract ကို မေပးႏုိုင္ဘူး
 * 			5.a္္bstract class တစ္ခုက java class မ်ားစြာကို extend လုပ္ႏိုင္သလို interfaces မ်ားကိုလည္း implements လုပ္ႏိုင္တယ္
 * 				interface ေတြကေတာ့ အၿခား interface တစ္ခုတည္းကိုပဲ implements လုပ္ႏိုင္တယ္
 *			7.abstract class က extend ကို သံုးတယ္
 *				interface က implements ကို သံုးတယ္
 *			8.abstract class မွာ class member မ်ားစြာရွိတယ္ ဥပမာ private, protected 
 *				interface မွာေတာ့ public တစ္ခုတည္းပဲရွိတယ္
 *			9.Syntax difference
					public abstract class Shape{
						public abstract void draw();
					}
					
					public interface Drawable{
						void draw();
					}
 * 			
 * 				
 * 			
 * */
public class Introduction {

}

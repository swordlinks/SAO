/*
Description
先定义一个圆类Circle，有double类型的半径属性，有带参数的构造函数和求面积的computeArea方法（为保护型的，返回值为面积，圆周率取3.14）；
然后定义一个从Circle派生的圆柱类Cylinder，增加double类型的高属性，有带参数的构造函数以及一个计算圆柱体积的成员函数，此函数中要用到从父类继承来的求面积方法。实现并测试这个类，在main()函数中读入数据, 然后输出体积。
要求主函数中必须调用Cylinder的构造函数语句。
Input
第一行输入数据的组数N，
然后有N组数据。每组数据由两个整型数组成，一个是半径，一个是高，数据之间以空格分隔。
Output
输出圆柱体积（保留2位有效数字）。
Sample Input
2
10 10
20 5
Sample Output
3140.00
6280.00



*/
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int N = input.nextInt();
			for(int i=0;i<N;i++){
				double r =input.nextInt();
				double h =input.nextInt();
				circle c1 = new circle(r);
				double v = c1.computeArea();
				Cylinder C1 = new Cylinder(v,h);
				System.out.printf("%.2f\n", C1.computeV());
			}
		}
	}
}
class circle{
	protected double r;
	public circle(){}
	public circle(double r)
	{
		this.r=r;
	}
	protected double computeArea()
	{
		return 3.14*this.r*this.r;
	}
}
class Cylinder extends circle
{
	protected double v,h;
	public Cylinder(){}
	public Cylinder(double v,double h){
		this.v=v;
		this.h=h;
	}
	protected double computeV(){
		return v*h;
	}
}

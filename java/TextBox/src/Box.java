
public class Box {
	int width, length, hight;
	
	Box(int w, int l, int h){
		int width = w;
		int length = l;
		int hight = h;
	}
	
	boolean isSameBox(Box obj) {
		if((obj.width==width)&&(obj.length==length)
				&&(obj.hight==hight))
			return true;
		else
			return false;
}
}

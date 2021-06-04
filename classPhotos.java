import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Write your code here.
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		
		if(redShirtHeights.get(redShirtHeights.size()-1) > blueShirtHeights.get(blueShirtHeights.size()-1)){
			for (int i = 0; i < redShirtHeights.size(); i++){
				if (redShirtHeights.get(i) <= blueShirtHeights.get(i))return false;
			}
		} else if(redShirtHeights.get(redShirtHeights.size()-1) < blueShirtHeights.get(blueShirtHeights.size()-1)){
			for (int i = 0; i < redShirtHeights.size(); i++){
				if (redShirtHeights.get(i) >= blueShirtHeights.get(i))return false;
			}
		} else {
			return false;
		}
		
    return true;
  }
}


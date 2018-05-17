package domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CollectionBean {
	private Object[] arr;
	private List list;
	private Map map;
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list
				+ ", map=" + map + "]";
	}
	
	

}

package controllers;

import java.io.Serializable;
import java.util.List;

import objects.Select2AbstractObject;

public class Select2ResultList implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<? extends Select2AbstractObject> result;
	private Boolean hasMore;

	public Select2ResultList(List<? extends Select2AbstractObject> result,
			Boolean hasMore) {
		this.result = result;
		this.hasMore = hasMore;
	}

	public List<?> getResult() {
		return result;
	}

	public void setResult(List<? extends Select2AbstractObject> result) {
		this.result = result;
	}

	public Boolean getHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	@Override
	public String toString() {
		return "Select2ResultList [result=" + result + ", hasMore=" + hasMore
				+ "]";
	}
}

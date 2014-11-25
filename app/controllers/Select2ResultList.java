package controllers;

import java.io.Serializable;
import java.util.List;

public class Select2ResultList implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<?> result;
	private Boolean hasMore;

	public Select2ResultList(List<?> result, Boolean hasMore) {
		this.result = result;
		this.hasMore = hasMore;
	}

	public List<?> getResult() {
		return result;
	}

	public void setResult(List<?> result) {
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

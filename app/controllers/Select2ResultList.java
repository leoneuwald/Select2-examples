package controllers;

import java.io.Serializable;
import java.util.List;

import objects.Select2Model;

public class Select2ResultList implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Select2Model> result;
	private Boolean hasMore;

	public Select2ResultList(List<Select2Model> result, Boolean hasMore) {
		this.result = result;
		this.hasMore = hasMore;
	}

	public List<Select2Model> getResult() {
		return result;
	}

	public void setResult(List<Select2Model> result) {
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

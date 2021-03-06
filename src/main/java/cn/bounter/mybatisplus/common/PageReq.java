package cn.bounter.mybatisplus.common;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * 分页请求
 * @author simon
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageReq<T> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//页号
	private Integer pageNum;
	
	//分页大小
	private Integer pageSize;
	
	//排序
	private String orderBy;
	
	//搜索关键字
	private String keyword;

	//请求对象
	private T reqObj;

	//偏移量（非请求参数）
	private Integer offset;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
	public Integer PageNum() {
		return pageNum;
	}

	public T getReqObj() {
		return reqObj;
	}

	public void setReqObj(T reqObj) {
		this.reqObj = reqObj;
	}

	public PageReq<T> PageNum(Integer pageNum) {
		this.pageNum = pageNum;
		return this;
	}

	public Integer PageSize() {
		return pageSize;
	}

	public PageReq<T> PageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	public String OrderBy() {
		return orderBy;
	}

	public PageReq<T> OrderBy(String orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public String Keyword() {
		return keyword;
	}

	public PageReq<T> Keyword(String keyword) {
		this.keyword = keyword;
		return this;
	}

	public Integer Offset() {
		return offset;
	}

	public PageReq<T> Offset(Integer offset) {
		this.offset = offset;
		return this;
	}

	public T ReqObj() {
		return reqObj;
	}

	public PageReq<T> ReqObj(T reqObj) {
		this.reqObj = reqObj;
		return this;
	}

}

package umut.banking.demo.entity.lazy;

import java.util.List;
import java.util.Map;



public class LazyDataModelBuilder<TEntity>
{
	private int start;
	private int end;
	private String sortField;
	private Long totalResultCount;
	private QuerySortOrder order;
	private Class<TEntity> clazz;
	private Map<String, Object> filters;
	private List<Object[]> customList;
	private List<TEntity> entityList;
	
	public LazyDataModelBuilder(Class<TEntity> clazz, int start, int end, String field, QuerySortOrder order, Map<String, Object> filters)
	{
		this.clazz = clazz;
		this.start = start;
		this.end = end;
		this.sortField = field;
		this.order = order;
		this.filters = filters;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public Long getTotalResultCount() {
		return totalResultCount;
	}

	public void setTotalResultCount(Long totalResultCount) {
		this.totalResultCount = totalResultCount;
	}

	public QuerySortOrder getOrder() {
		return order;
	}

	public void setOrder(QuerySortOrder order) {
		this.order = order;
	}

	public Class<TEntity> getClazz() {
		return clazz;
	}

	public void setClazz(Class<TEntity> clazz) {
		this.clazz = clazz;
	}

	public Map<String, Object> getFilters() {
		return filters;
	}

	public void setFilters(Map<String, Object> filters) {
		this.filters = filters;
	}

	public List<Object[]> getCustomList() {
		return customList;
	}

	public void setCustomList(List<Object[]> customList) {
		this.customList = customList;
	}

	public List<TEntity> getEntityList() {
		return entityList;
	}

	public void setEntityList(List<TEntity> entityList) {
		this.entityList = entityList;
	}
}

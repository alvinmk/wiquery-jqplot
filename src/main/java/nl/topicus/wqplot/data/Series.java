package nl.topicus.wqplot.data;

import java.util.List;

public interface Series<K, V, E extends SeriesEntry<K, V>>
{
	public List<E> getData();
}

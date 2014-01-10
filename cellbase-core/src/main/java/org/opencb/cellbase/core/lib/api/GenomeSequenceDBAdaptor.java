package org.opencb.cellbase.core.lib.api;


import org.opencb.cellbase.core.common.Region;
import org.opencb.commons.containers.map.QueryOptions;
import org.opencb.commons.containers.QueryResult;

import java.util.List;


public interface GenomeSequenceDBAdaptor {

	
	public QueryResult getByRegion(String chromosome, int start, int end, QueryOptions options);

	public List<QueryResult> getAllByRegionList(List<Region> regions, QueryOptions options);

	public String getRevComp(String sequence);

	
}

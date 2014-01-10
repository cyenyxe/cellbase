package org.opencb.cellbase.core.lib.api;


import org.opencb.cellbase.core.common.Region;
import org.opencb.commons.containers.map.QueryOptions;
import org.opencb.commons.containers.QueryResult;

import java.util.List;


public interface ConservedRegionDBAdaptor {

    public QueryResult getAllByRegion(Region region, QueryOptions options);

    public List<QueryResult> getAllByRegionList(List<Region> regions, QueryOptions options);


}

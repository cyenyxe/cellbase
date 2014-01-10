package org.opencb.cellbase.core.lib.api;

import org.opencb.commons.containers.map.QueryOptions;
import org.opencb.commons.containers.QueryResult;

import java.util.List;

/**
 * Created by imedina on 10/12/13.
 */
public interface ProteinFunctionPredictorDBAdaptor {


    public QueryResult getAllByEnsemblTranscriptId(String transcriptId, QueryOptions options);

    public List<QueryResult> getAllByEnsemblTranscriptIdList(List<String> transcriptIdList, QueryOptions options);

}

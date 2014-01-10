package org.opencb.cellbase.core.lib.api.variation;

import org.opencb.cellbase.core.common.variation.GenomicVariant;
import org.opencb.commons.containers.map.QueryOptions;
import org.opencb.commons.containers.QueryResult;

import java.util.List;


public interface VariantEffectDBAdaptor {


    @Deprecated
	public QueryResult getAllConsequenceTypesByVariant(GenomicVariant variant, QueryOptions options);

    @Deprecated
	public List<QueryResult> getAllConsequenceTypesByVariantList(List<GenomicVariant> variants, QueryOptions options);
	

	public QueryResult getAllEffectsByVariant(GenomicVariant variant, QueryOptions options);
	
	public  List<QueryResult> getAllEffectsByVariantList(List<GenomicVariant> variants, QueryOptions options);
	
//	public List<GenomicVariantEffect> getAllConsequenceTypeByVariant(GenomicVariant variant);
//	
//	public List<GenomicVariantEffect> getAllConsequenceTypeByVariant(GenomicVariant variant, Set<String> excludeSet);
//
//	
//	public List<GenomicVariantEffect> getAllConsequenceTypeByVariantList(List<GenomicVariant> variants);
//
//	public List<GenomicVariantEffect> getAllConsequenceTypeByVariantList(List<GenomicVariant> variants, Set<String> excludeSet);

	
//	public Map<GenomicVariant, List<GenomicVariantEffect>> getConsequenceTypeMap(List<GenomicVariant> variants);
//
//	public Map<GenomicVariant, List<GenomicVariantEffect>> getConsequenceTypeMap(List<GenomicVariant> variants, Set<String> excludeSet);

}

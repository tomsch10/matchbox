package ch.ahdis.fhir.hapi.jpa.validation;

import java.util.List;

import org.hl7.fhir.instance.model.api.IIdType;
import org.hl7.fhir.r4.model.CodeSystem;
import org.hl7.fhir.r4.model.ConceptMap;
import org.hl7.fhir.r4.model.ValueSet;

import ca.uhn.fhir.jpa.entity.TermCodeSystemVersion;
import ca.uhn.fhir.jpa.entity.TermConcept;
import ca.uhn.fhir.jpa.model.entity.ResourceTable;

import ca.uhn.fhir.jpa.term.UploadStatistics;
import ca.uhn.fhir.jpa.term.api.ITermCodeSystemStorageSvc;
import ca.uhn.fhir.jpa.term.custom.CustomTerminologySet;
import ca.uhn.fhir.rest.api.server.RequestDetails;
import ca.uhn.fhir.rest.api.server.storage.ResourcePersistentId;

public class NullTermCodeSystemStorageSvcImpl implements ITermCodeSystemStorageSvc {

  @Override
  public void storeNewCodeSystemVersion(ResourcePersistentId theCodeSystemResourcePid, String theSystemUri,
      String theSystemName, String theSystemVersionId, TermCodeSystemVersion theCodeSystemVersion,
      ResourceTable theCodeSystemResourceTable, RequestDetails theRequestDetails) {
    
  }

  @Override
  public IIdType storeNewCodeSystemVersion(CodeSystem theCodeSystemResource, TermCodeSystemVersion theCodeSystemVersion,
      RequestDetails theRequestDetails, List<ValueSet> theValueSets, List<ConceptMap> theConceptMaps) {
    return null;
  }

  @Override
  public void storeNewCodeSystemVersionIfNeeded(CodeSystem theCodeSystem, ResourceTable theResourceEntity,
      RequestDetails theRequestDetails) {
  }

  @Override
  public UploadStatistics applyDeltaCodeSystemsAdd(String theSystem, CustomTerminologySet theAdditions) {
    return null;
  }

  @Override
  public UploadStatistics applyDeltaCodeSystemsRemove(String theSystem, CustomTerminologySet theRemovals) {
    return null;
  }

  @Override
  public int saveConcept(TermConcept theNextConcept) {
    return 0;
  }

}

package ch.ahdis.fhir.hapi.jpa.validation;

import org.hl7.fhir.r4.model.ConceptMap;
import org.springframework.beans.factory.annotation.Autowired;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.support.TranslateConceptResults;
import ca.uhn.fhir.jpa.api.model.TranslationRequest;
import ca.uhn.fhir.jpa.model.entity.ResourceTable;

public class NullTermConceptMappingSvcImpl implements ca.uhn.fhir.jpa.term.api.ITermConceptMappingSvc {

  @Autowired
  private FhirContext myContext;
  
  @Override
  public FhirContext getFhirContext() {
    return myContext;
  }

  @Override
  public TranslateConceptResults translate(TranslationRequest theTranslationRequest) {
    return null;
  }

  @Override
  public TranslateConceptResults translateWithReverse(TranslationRequest theTranslationRequest) {    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteConceptMapAndChildren(ResourceTable theResourceTable) {
  }

  @Override
  public void storeTermConceptMapAndChildren(ResourceTable theResourceTable, ConceptMap theConceptMap) {
  }

}

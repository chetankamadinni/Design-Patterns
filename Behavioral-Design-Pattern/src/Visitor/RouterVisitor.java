package Visitor;

public interface RouterVisitor {

	public void visit(TPLinkRouter tpLinkRouter);
	
	public void visit(DLinkRouter dLinkRouter);
}

package Visitor;

public class WindowsConfig implements RouterVisitor {

	@Override
	public void visit(TPLinkRouter tpLinkRouter) {
		System.out.println("TPLinkRouter config for Windows");

	}

	@Override
	public void visit(DLinkRouter dLinkRouter) {
		System.out.println("DLinkRouter config for Windows");

	}

}

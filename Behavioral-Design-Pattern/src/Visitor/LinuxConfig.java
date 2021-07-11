package Visitor;

public class LinuxConfig implements RouterVisitor {

	@Override
	public void visit(TPLinkRouter tpLinkRouter) {
		System.out.println("TPLinkRouter config for Linux");

	}

	@Override
	public void visit(DLinkRouter dLinkRouter) {
		System.out.println("DLinkRouter config for Linux");

	}

}

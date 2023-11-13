package comportamentais.TemplateMethod;

public class WebApplicationProject extends Project {
    @Override
    protected void gatherRequirements() {
        System.out.println("Gathering web application requirements");
    }

    @Override
    protected void designSolution() {
        System.out.println("Designing web application solution");
    }

    @Override
    protected void implementSolution() {
        System.out.println("Implementing web application solution");
    }

    @Override
    protected void testSolution() {
        System.out.println("Testing web application solution");
    }

    @Override
    protected void deploySolution() {
        System.out.println("Deploying web application solution");
    }

    protected void celebrateSuccess() {
        System.out.println("Web application project successfully deployed! Time to celebrate with the team.");
    }
}

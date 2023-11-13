package comportamentais.TemplateMethod;

abstract public class Project {

    public final void executeProject() {
        gatherRequirements();
        designSolution();
        implementSolution();
        testSolution();
        deploySolution();
        celebrateSuccess();
    }

    protected abstract void gatherRequirements();
    protected abstract void designSolution();
    protected abstract void implementSolution();
    protected abstract void testSolution();
    protected abstract void deploySolution();

    protected void celebrateSuccess() {
        System.out.println("Project completed successfully!");
    }
}

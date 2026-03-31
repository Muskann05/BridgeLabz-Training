public class Main {
    public static void main(String[] args) {
        ReportExporter report = new SalesReport();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
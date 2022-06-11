package mvc;

class SetItemQty
{
    private double qty;
    private double item;

    public double getQty()
    {
        return qty;
    }

    public void setQty(double qty)
    {
        this.qty = qty;
    }

    public double getItem()
    {
        return item;
    }

    public void setItem(double item)
    {
        this.item = item;
    }
}

class SetItemQtyView
{
    public void printCalculationDetails(double item, double qty)
    {
        System.out.println("Calculation: ");
        System.out.println("Name: " + item);
        System.out.println("Roll No: " + qty);
    }
}

class CalculationController
{
    private SetItemQty model;
    private SetItemQtyView view;

    public CalculationController(SetItemQty model, SetItemQtyView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(double item)
    {
        model.setItem(item);
    }

    public double getItemCal()
    {
        return model.getItem();
    }

    public void setQtyCal(double qtyCal)
    {
        model.setQty(qtyCal);
    }

    public double getCalQty()
    {
        return model.getQty();
    }

    public void updateView()
    {
        view.printCalculationDetails(model.getItem(), model.getQty());
    }
}

class MVCPattern
{
    public static void main(String[] args)
    {
        SetItemQty model = retriveStudentFromDatabase();

        SetItemQtyView view = new SetItemQtyView();

        CalculationController controller = new CalculationController(model, view);

        controller.updateView();

        controller.setStudentName(10);

        controller.updateView();
    }

    private static SetItemQty retriveStudentFromDatabase()
    {
        SetItemQty calcu = new SetItemQty();
        calcu.setItem(10);
        calcu.setQty(20);
        return calcu;
    }

}

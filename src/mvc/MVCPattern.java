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
    public double calculateTotal(double item, double qty)
    {
      double basePrice = qty * item;
      if (basePrice>1000){
          return (basePrice*0.95);
      }else {
          return basePrice*0.98;
      }
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
        view.calculateTotal(model.getItem(), model.getQty());
    }
}

class MVCPattern
{
    public static void main(String[] args)
    {
        SetItemQty model = retriveCalCulatinFromDatabase();

        SetItemQtyView view = new SetItemQtyView();

        CalculationController controller = new CalculationController(model, view);

        controller.updateView();

        controller.setStudentName(10);

        controller.updateView();
    }

    private static SetItemQty retriveCalCulatinFromDatabase()
    {
        SetItemQty calcu = new SetItemQty();
        calcu.setItem(10);
        calcu.setQty(20);
        return calcu;
    }

}

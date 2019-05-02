package gui;



import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientHomePage extends JFrame implements ActionListener
{

    private JComboBox addCombo,lists,chooseCustomer,chooseDvd,dvdCategory,returnCombo;
    private JButton rentbtn,listcombo,returnbtn,saveCustomer,saveRentbtn,saveNewDvd,returnDvd;
    private JTextField customerNumber,firstName,surName,phoneNumber,dvdNumberField,dvdPriceField,returnField;
    private JRadioButton credite,canRent,availlableRb,newRealise;

    //lables for the picture
    private JLabel logpic,lookpic,custTitle,rentDvd,newDvd,returnlabel;

    private JTextArea textArea ;
    private JTable jTable ;
    private JTextArea vide1,vide2,vide3,vide4,vide5,vide6,vide7,vide8,vide9,vide10;


    private JPanel rightPanel;
    private JPanel centerPanel ;
    private GridBagConstraints constraints;
    private GridBagLayout gridLayout;
    private Component componentt;
    private JLabel icon ;
    private JLabel icon1;

    private TitledBorder t1 = new TitledBorder("Dispaly");
    private TitledBorder t2 = new TitledBorder("");

    private String addList[]={"CUSTOMER","DVD"};
    private String addList2[]={"CUSTOMER","DVD","RENTED DVD","OUTSTANDING DVD"};
    private String categoryList[]={"Action","comedy","romain"};

    public ClientHomePage() {
        super();
        gridLayout = new GridBagLayout();
        //gridLayout(new GridBagLayout());
       setLayout(gridLayout);
        constraints=new GridBagConstraints();

         addCombo = new JComboBox(addList);
        lists = new JComboBox(addList2);
        dvdCategory = new JComboBox(categoryList);
        chooseCustomer=new JComboBox();          // THIS NEED TO BE REMOVED FROM HERE TO THE ACTION LISNER WHERE WE WILL BE CUPTURING THE RENT VALUES
        chooseDvd = new JComboBox();
         addCombo.addActionListener(this);
         rentbtn = new JButton("RENT");
         listcombo = new JButton("LIST");
         returnbtn = new JButton("RETRUN");
        returnbtn.addActionListener(this);
        saveRentbtn = new JButton("SAVE RENT");
        saveNewDvd = new JButton("SAVE NEW DVD");
        saveNewDvd.addActionListener(this);
        saveRentbtn.addActionListener(this);
        rentbtn.addActionListener(this);
        newDvd = new JLabel("NEW DVD");
        //CUSTOMER OBJECTS FOR UI
        //private JTextField customerNumber,firstName,surName,phoneNumber;
        //private RadioButton credite,canRent;
        custTitle =  new JLabel("NEW CUSTOMER");
        rentDvd =  new JLabel("RENT DVD");

        saveCustomer = new JButton("SAVE");
        saveCustomer.addActionListener(this);
        customerNumber = new JTextField("customerNumber",10);
        firstName = new JTextField("firstName",10);
        surName = new JTextField("surname",10);
        phoneNumber = new JTextField("phoneNumber",10);
        credite = new JRadioButton("credit");
        canRent = new JRadioButton("can rent");
        dvdNumberField = new JTextField("DVD NUMBER");
        dvdPriceField = new JTextField("Price");
        availlableRb = new JRadioButton("available");
        newRealise = new JRadioButton("New Realise");
        returnCombo = new JComboBox();
        returnDvd = new JButton("save");
        returnDvd.addActionListener(this);
        returnField= new JTextField(10);
        returnlabel= new JLabel("RETURN");

        //lables for the picture
        logpic =new JLabel();
        lookpic = new JLabel();

        textArea = new JTextArea(10,30);
        textArea.setEditable(false);
        jTable = new JTable(27,4 );
        vide1= new JTextArea("1");
        vide2= new JTextArea("");
        vide3= new JTextArea("3");
        vide4= new JTextArea("4");
        vide5= new JTextArea("5");
        vide6= new JTextArea("6");
        vide7= new JTextArea("7");
        vide8= new JTextArea("8");
        vide9= new JTextArea("9");

        //removed
        vide2.setEditable(false);
        vide7.setVisible(false);
        vide8.setVisible(false);

        rightPanel = new JPanel();
        centerPanel = new JPanel();

        icon = new JLabel();
        icon1 = new JLabel();

        //set pictures into a JLabel
        logpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\dvdShop\\src\\main\\resources\\Sans-titre-1.png"));
        lookpic.setIcon(new javax.swing.ImageIcon(("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\dvdShop\\src\\main\\resources\\dvdicn.png")));

        //addComponent(lookpic,0,1,1,13);
        lookpic.setVisible(true);
        adder1();
        //addCustomer();
        customerFalse();
        setRentbtnFalse();
        setdvdPanelFalse();
        setReturnFalse();//this method add return panel but setVisiblity to false


    }
    //THE FOLLOWING METHOD SAVES FOR THE RETURN BUTTON
    public void setReturnFalse()
    {
        addComponent(returnlabel,0,1,1,1);
        returnlabel.setVisible(false);
        addComponent(returnCombo,1,1,1,1);
        returnCombo.setVisible(false);
        addComponent(returnField,2,1,1,1);
        returnField.setVisible(false);
        addComponent(returnDvd,10,1,1,1);
        returnDvd.setVisible(false);
    }
    public void getReturbTrue()
    {
        addComponent(returnlabel,0,1,1,1);
        returnlabel.setVisible(true);
        addComponent(returnCombo,1,1,1,1);
        returnCombo.setVisible(true);
        addComponent(returnField,2,1,1,1);
        returnField.setVisible(true);
        addComponent(returnDvd,10,1,1,1);
        returnDvd.setVisible(true);
    }
    //ADD A PANEL FOR THE NEW DVD PANEL WHICH IS SET TO INVISIBLE.
    public void getDvdPanelTrue()
    {
        addComponent(newDvd,0,1,1,1);
        newDvd.setVisible(true);
        addComponent(dvdNumberField,1,1,1,1);
        dvdNumberField.setVisible(true);
        addComponent(dvdCategory,3,1,1,1);
        dvdCategory.setVisible(true);
        addComponent(newRealise,4,1,1,1);
        newRealise.setVisible(true);
        addComponent(dvdPriceField,5,1,1,1);
        dvdPriceField.setVisible(true);
        addComponent(availlableRb,6,1,1,1);
        availlableRb.setVisible(true);
        addComponent(saveNewDvd,10,1,1,1);
        saveNewDvd.setVisible(true);

    }
    public void setdvdPanelFalse()
    {
        addComponent(newDvd,0,1,1,1);
        newDvd.setVisible(false);
        addComponent(dvdNumberField,2,1,1,1);
        dvdNumberField.setVisible(false);
        addComponent(dvdCategory,4,1,1,1);
        dvdCategory.setVisible(false);
        addComponent(newRealise,6,1,1,1);
        newRealise.setVisible(false);
        addComponent(dvdPriceField,8,1,1,1);
        dvdPriceField.setVisible(false);
        addComponent(availlableRb,9,1,1,1);
        availlableRb.setVisible(false);
        addComponent(saveNewDvd,10,1,1,1);
        saveNewDvd.setVisible(false);

    }
    public void addComponent(Component component,int row,int column,int widht ,int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth= widht;
        constraints.gridheight=height;
        gridLayout.setConstraints(component,constraints);
        add(component);
    }
    public void adder1()
    { constraints.weighty=0;
        constraints.weightx=0;
        constraints.fill = GridBagConstraints.BOTH;
        logpic.setBorder(t2);
        addComponent(logpic,0,0,1,8);
        //addCustomer();
        constraints.fill = GridBagConstraints.BOTH;

        addComponent(lookpic,0,1,1,13);

        addComponent(jTable,0,2,1,16);

        vide1.setEnabled(false);

        //addComponent(vide1,7,0,1,1);
        addComponent(addCombo,8,0,1,1);
        addComponent(rentbtn,10,0,1,1);
        addComponent(vide8,13,0,1,1);
        addComponent(returnbtn,12,0,1,1);
        addComponent(lists,14,0,1,1);
        textArea.setBorder(t1);
        addComponent(textArea,13,1,1,3);
        addComponent(vide2,15,0,1,1);}
        public void customerFalse()
        {
            custTitle.setVisible(false);
            vide3 .setVisible(false);
            customerNumber.setVisible(false);
            vide4 .setVisible(false);
            firstName .setVisible(false);
            vide5 .setVisible(false);
            surName .setVisible(false);
            vide6 .setVisible(false);
            phoneNumber.setVisible(false);
            credite .setVisible(false);
            canRent .setVisible(false);
            vide7 .setVisible(false);
            saveCustomer .setVisible(false);

        }
        //THIS METHOD SET THE RENT PANEL TO TRUE
        public void setRentbtnFalse()
        {
            addComponent(rentDvd,0,1,1,1);
            rentDvd.setVisible(false);
            addComponent(chooseCustomer,1,1,1,1);
            chooseCustomer.setVisible(false);
            addComponent(chooseDvd,2,1,1,1);
            chooseDvd.setVisible(false);
            addComponent(saveRentbtn,10,1,1,1);
            saveRentbtn.setVisible(false);
        }
        public void setRentbtnTrue()                                                 //this method return the containts of the Addcustomer panel
        {
            addComponent(rentDvd,0,1,1,1);
            rentDvd.setVisible(true);
            addComponent(chooseCustomer,2,1,1,1);
            chooseCustomer.setVisible(true);
            addComponent(chooseDvd,3,1,1,1);
            chooseDvd.setVisible(true);
            addComponent(saveRentbtn,10,1,1,1);
            saveRentbtn.setVisible(true);
        }
        public void customerTrue()                                                     //this method sets the cutomer panel to true.
        {
            custTitle.setVisible(true);
            vide3 .setVisible(true);
            customerNumber.setVisible(true);
            vide4 .setVisible(true);
            firstName .setVisible(true);
            vide5 .setVisible(true);
            surName .setVisible(true);
            vide6 .setVisible(true);
            phoneNumber.setVisible(true);
            credite .setVisible(true);
            canRent .setVisible(true);
            vide7 .setVisible(false);
            saveCustomer .setVisible(true);
        }
        public void refreesherScreen() //this method refresh the all panel
        {
            rightPanel=(JPanel) getContentPane();
            rightPanel.removeAll();
            gridLayout=new GridBagLayout();
            setLayout(gridLayout);
            constraints=new GridBagConstraints();
        }

        public void addCustomer()
        {
            constraints.weighty=0;
            constraints.weightx=0;
            constraints.fill=GridBagConstraints.BOTH;
            addComponent(custTitle,0,1,1,1);
           // addComponent(vide3,1,1,1,1);
            addComponent(customerNumber,1,1,1,1);
           // addComponent(vide4,3,1,1,1);
            addComponent(firstName,2,1,1,1);
            //addComponent(vide5,5,1,1,1);
            addComponent(surName,3,1,1,1);
           // addComponent(vide6,7,1,1,1);
            addComponent(phoneNumber,4,1,1,1);
            addComponent(credite,5,1,1,1);
            addComponent(canRent,6,1,1,1);
            addComponent(vide7,7,1,1,1);
            addComponent(saveCustomer,10,1,1,1);
        }

    public void actionPerformed(ActionEvent e) {
        String addchoice=null;
        if(e.getSource()==addCombo)
        {
            addchoice = (String)addCombo.getSelectedItem();
            System.out.println(addchoice);

            //WE CHECKING WHAT IS IN THE RETURNED BY THE COMBO BOX(addCombo)
            if(addchoice.equalsIgnoreCase("DVD"))
            {
                System.out.println("we are in"+addchoice);
                refreesherScreen();
                lookpic.setVisible(false);
                // addCustomer();
                adder1();
                getDvdPanelTrue();
                System.out.println("addcustomer succesful");
                invalidate();
                repaint();


            }
            if(addchoice.equalsIgnoreCase("CUSTOMER"))
            {

                System.out.println("we are in");
                refreesherScreen();
                lookpic.setVisible(false);
                addCustomer();
                adder1();
                customerTrue();
                System.out.println("addDVD succesful");
                invalidate();
                repaint();

            }

        }
        if(e.getSource()==saveCustomer)
        {
            System.out.println("into the saving customer mode");
            refreesherScreen();
            lookpic.setVisible(true);
            addCustomer();
            adder1();
            customerFalse();
            invalidate();
            repaint();
        }
        if(e.getSource()==rentbtn)
        {
            refreesherScreen();
            lookpic.setVisible(false);
            setRentbtnTrue();
            adder1();
            invalidate();
            repaint();
        }
        if(e.getSource()==saveRentbtn)//when the button save on the RENT panel is pressed this condition brings to home panel
        {
            refreesherScreen();
            lookpic.setVisible(true);
            addCustomer();
            adder1();
            customerFalse();
            invalidate();
            repaint();
        }
        if(e.getSource()==saveNewDvd)//when the button save on the dvd panel is pressed this condition brings to home panel
        {
            refreesherScreen();
            lookpic.setVisible(true);
            addCustomer();
            adder1();
            customerFalse();
            invalidate();
            repaint();
        }
        if(e.getSource()==returnbtn)
        {
            refreesherScreen();
            lookpic.setVisible(false);
            getReturbTrue();
            adder1();
            invalidate();
            repaint();

        }
        if(e.getSource()==returnDvd)
        {
            refreesherScreen();
            lookpic.setVisible(true);
            addCustomer();
            adder1();
            customerFalse();
            invalidate();
            repaint();
        }

    }
}

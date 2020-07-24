package GUI;

import code.FileStorage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;

public class CreateTicket extends javax.swing.JFrame {
    private static String[] authUser = null;
    private static String edit = "false";
    private static int busArrSize = 0;
    DefaultComboBoxModel timeComboBoxModel = new DefaultComboBoxModel();
    DefaultComboBoxModel seatComboBoxModel = new DefaultComboBoxModel();
    String[] currentSelectedTicket= null;
    /**
     * Creates new form CreateTicket
     */
    public CreateTicket() {
        initComponents();
        jPanel4.setVisible(false);
        seatDropMenu.setEnabled(false);
        timeDropMenu.setModel(timeComboBoxModel);
        seatDropMenu.setModel(seatComboBoxModel);
        if (edit.equals("true")) {
            tabbedPane.setSelectedIndex(tabbedPane.indexOfTab("Step 2"));
            tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 1"), false);
            tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 2"), true);
            jPanel4.setVisible(true);
        }
    }

    /**
     * To Do:
     * 1.Include all necessary stuff (make the environment suitable for functions)
     * 2.add all needed filestorage files
     * 3make the cl;ass allow creating and editing
     * 4.finish step1 tab
     * 5.finish step2 tab
     * 6.test the class and fix bugs
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        originDropMenu = new javax.swing.JComboBox<>();
        destinationDropMenu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        selectBusDropMenu = new javax.swing.JComboBox<>();
        nextBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        timeDropMenu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        distance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seatDropMenu = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fare = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        origin = new javax.swing.JLabel();
        destination = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        noteMsg = new javax.swing.JLabel();
        datePicker = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        searchTicketBtn = new javax.swing.JButton();
        ticketIDText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ticketID = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setTitle("Bus Ticket Reservation - Book Ticket");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Origin");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Destination");

        originDropMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        originDropMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originDropMenuActionPerformed(evt);
            }
        });

        destinationDropMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destinationDropMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationDropMenuActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Origin", "Destination", "Distance", "Cash", "Seats"
            }
        ));
        jTable2.setEditingColumn(0);
        jTable2.setEditingRow(0);
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Select Bus Number:");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(originDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearBtn)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectBusDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nextBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(searchBtn)
                    .addComponent(clearBtn)
                    .addComponent(originDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(selectBusDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Step 1", jPanel1);

        timeDropMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeDropMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Origin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Destination");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Distance");

        distance.setText("--");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Time");

        seatDropMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatDropMenuActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        bookBtn.setText("Book");
        bookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cash");

        fare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fare.setText("--");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Seat");

        origin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        origin.setText("--");

        destination.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        destination.setText("--");

        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        datePicker.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePickerPropertyChange(evt);
            }
        });

        searchTicketBtn.setText("Search");
        searchTicketBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTicketBtnMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Enter Ticket ID");

        deleteBtn.setText("Delete");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ticket Number");

        ticketID.setText("--");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(ticketIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchTicketBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)))
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(searchTicketBtn)
                    .addComponent(deleteBtn)
                    .addComponent(ticketIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ticketID))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(distance)
                .addGap(332, 332, 332))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(cancelBtn)
                                    .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(seatDropMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(backBtn)
                                    .addGap(83, 83, 83)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(noteMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 119, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(origin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(276, 276, 276)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(origin)
                    .addComponent(destination))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(distance))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(timeDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(seatDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fare))
                .addGap(33, 33, 33)
                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addGap(25, 25, 25))
        );

        tabbedPane.addTab("Step 2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void formOpened(){
        if (edit.equals("true")) {
            setTitle("Bus Ticket Reservation - Edit Ticket");
            bookBtn.setText("Save Changes");
        }
    // Makes Origin and Destination Drop Menu functional by reading cities filestorage and adding all origins and not making em duplicates
        ArrayList<String> origin = new ArrayList<>();
        try {
            ArrayList<String[]> cities = FileStorage.readData("cities");
            for (String[] city : cities) {
                if (!origin.contains(city[1])) {
                    origin.add(city[1]);
                }
            }
        } catch (Exception e) {
        }
        String[] originArr = new String[origin.size()];
        originArr = origin.toArray(originArr);

        originArr[0] = "-- Select Origin --";
        DefaultComboBoxModel originModel = new DefaultComboBoxModel(originArr);
        originDropMenu.setModel(originModel);
        //Destination
        ArrayList<String> destination = new ArrayList<>();
        try {
            ArrayList<String[]> cities = FileStorage.readData("cities");
            for (String[] city : cities) {
                if (!destination.contains(city[2])) {
                    destination.add(city[2]);
                }
            }
        } catch (Exception e) {
        }
        String[] destinationArr = new String[destination.size()];
        destinationArr = destination.toArray(destinationArr);

        destinationArr[0] = "-- Select Destination --";
        DefaultComboBoxModel destinationModel = new DefaultComboBoxModel(destinationArr);
        destinationDropMenu.setModel(destinationModel);

        //User Authentication
//        for (String[] ticket:tickets){
//            if (authUser[0].equals(ticket[1])){
//                model.addRow(ticket);
//            }
//        }

        //Make GUI changes depending on creating or editing (if creating create new ticket id)
        if (edit.equals("true")) {
            jLabel10.setVisible(true);
            ticketIDText.setVisible(true);
            searchTicketBtn.setVisible(true);
            deleteBtn.setVisible(true);
        } else {
            try {
                Integer newID = (Integer.parseInt(FileStorage.getLastId("tickets")) + 1);
                ticketID.setText(String.valueOf(newID));
            } catch (Exception e) {
            }
        }
    }

    String getBusData(int y){
     ArrayList<String> busData = new ArrayList<>();
     try {
        ArrayList<String[]> buses = FileStorage.readData("buses");
        for (String[] bus : buses) {
            if (selectBusDropMenu.getSelectedItem().toString().equals((bus[0]))) {
                for (String details:bus){
                    busData.add(details);
                }
            }
        }
    } catch (Exception e) {
    }
    busArrSize = busData.size();
    return busData.get(y);
}

void checkSeats(){
    String busID = getBusData(0);
    Integer numberOfSeats = Integer.parseInt(getBusData(5));
    if(timeDropMenu.getModel().getSize()!=0 && datePicker.getDate()!=null){
        seatDropMenu.setEnabled(true);
        try {
            ArrayList<String[]> trips = FileStorage.readData("trips");
            trips.remove(0);
            String[] seatArr = new String[numberOfSeats];
            for (int i = 0; i < numberOfSeats; i++) {
                seatArr[i] = (String.valueOf(i + 1));
            }
            DefaultComboBoxModel seatModel = new DefaultComboBoxModel(seatArr);
            seatDropMenu.setModel(seatModel);
            for (String[] trip : trips) {
                    //checks if there is a trip matching bus no., this time and date
                Calendar g = datePicker.getCalendar();
                String computedDate = String.valueOf(g.get(Calendar.DATE))  + "/" + String.valueOf(g.get(Calendar.MONTH) + 1) + "/" + String.valueOf(g.get(Calendar.YEAR));
                if(trip[0].equals(busID) && trip[1].equals(computedDate) && trip[2].equals(timeDropMenu.getSelectedItem().toString())){
                    seatComboBoxModel.removeAllElements();
                    seatDropMenu.setModel(seatComboBoxModel);
                    String[] seatsTaken= new String[trip.length-3];
                    for(int i = 3;i<trip.length;i++) {
                        seatsTaken[i-3]=trip[i];
                    }
                    if (seatsTaken.length != numberOfSeats) {
                        List<String> upset = Arrays.asList(seatsTaken);
                        for (int i=0; i < numberOfSeats;i++ ) {
                            if (!upset.contains(String.valueOf(i+1))) {
                                seatComboBoxModel.addElement(String.valueOf(i+1));
                            }
                        }
                    }else JOptionPane.showMessageDialog(null, "Sorry, the bus is full!");

                        // DefaultComboBoxModel seatModel = new DefaultComboBoxModel(seatArr);
                        //seatDropMenu.setModel(seatModel);

                }
            }
        } catch (Exception e) {
        }
    }
}

    private void bookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookBtnMouseClicked
        try {
            Calendar g = datePicker.getCalendar();
            String x = String.valueOf((Integer.parseInt(FileStorage.getLastId("tickets")) + 1));
            String computedDate = String.valueOf(g.get(Calendar.DATE))  + "/" + String.valueOf(g.get(Calendar.MONTH) + 1) + "/" + String.valueOf(g.get(Calendar.YEAR));
            String[] data = {
                x,
                authUser[0],
                getBusData(0),
                origin.getText(),
                destination.getText(),
                distance.getText(),
                fare.getText(),
                seatDropMenu.getSelectedItem().toString(),
                computedDate,
                timeDropMenu.getSelectedItem().toString()
            };
            ArrayList<String[]> trips = FileStorage.readData("trips");
            boolean foundTrip = false;
            ArrayList<String> selectedTrip = new ArrayList<>();
            for (int i=0; i < trips.size(); i++) {
                if(trips.get(i)[0].equals(getBusData(0)) && trips.get(i)[1].equals(computedDate) && trips.get(i)[2].equals(timeDropMenu.getSelectedItem().toString())){
                    for (String tripDetail : trips.get(i)) {
                        selectedTrip.add(tripDetail);
                    }
                    foundTrip = true;
                    break;
                }
                if(i == trips.size()-1){
                    selectedTrip.add(getBusData(0));
                    selectedTrip.add(computedDate);
                    selectedTrip.add(timeDropMenu.getSelectedItem().toString());
                    selectedTrip.add("0");
                }
            }
            selectedTrip.add(seatDropMenu.getSelectedItem().toString());
            if (edit.equals("true")){
                if (selectedTrip.contains(currentSelectedTicket[7])){
                    selectedTrip.remove(currentSelectedTicket[7]);
                }
            }
            String[] updatedRows = new String[selectedTrip.size()];
            updatedRows = selectedTrip.toArray(updatedRows);
            if (edit.equals("true")) {
                data[0] = ticketID.getText();
                FileStorage.updateRecord("tickets", data[0] ,data);
                if (foundTrip) {

                    FileStorage.updateTrip("trips", getBusData(0),computedDate,timeDropMenu.getSelectedItem().toString(), updatedRows);
                }else FileStorage.addRecord("trips", updatedRows);
                JOptionPane.showMessageDialog(null, "Ticket Number "+data[0]+" updated!");
                dispose();
            }else {
                FileStorage.addRecord("tickets", data);
                if (foundTrip) {
                    FileStorage.updateTrip("trips", getBusData(0),computedDate,timeDropMenu.getSelectedItem().toString(), updatedRows);
                }else FileStorage.addRecord("trips", updatedRows);

                JOptionPane.showMessageDialog(null, "Ticket Number "+x+" booked!");
                dispose();
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"UnknownError happened! try again later.");
        }

    }//GEN-LAST:event_bookBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void timeDropMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeDropMenuActionPerformed
        // TODO add your handling code here:
        checkSeats();
    }//GEN-LAST:event_timeDropMenuActionPerformed

    private void seatDropMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 2"), false);
        formOpened();
    }//GEN-LAST:event_formWindowOpened

    private void searchTicketBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTicketBtnMouseClicked
        if (!ticketIDText.getText().equals("")) {
            try {
                ArrayList<String[]> tickets = FileStorage.readData("tickets");
                boolean found = false;
                for (String[] ticket : tickets) {
                    if (ticket[0].equals(ticketIDText.getText()) && ticket[1].equals(authUser[0])) {
                        currentSelectedTicket = ticket;
                        ticketID.setText(ticket[0]);
                        originDropMenu.getModel().setSelectedItem(ticket[3]);
                        destinationDropMenu.getModel().setSelectedItem(ticket[4]);
                        selectBusDropMenu.addItem(ticket[2]);
                        nextBtnMouseClicked(null);
                        distance.setText(ticket[5]);
                        origin.setText(ticket[3]);
                        destination.setText(ticket[4]);
                        timeDropMenu.setSelectedItem(ticket[9]);
                        Date wx = new SimpleDateFormat("d/M/yyyy").parse(ticket[8]);
                        datePicker.setDate(wx);
                        checkSeats();
                        seatDropMenu.getModel().setSelectedItem(ticket[7]);
                        fare.setText(ticket[6]);

                        found = true;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Enter a valid ticket number, please!");
                }
            } catch (Exception e) {
            }
        } else JOptionPane.showMessageDialog(null, "Enter a ticket number first, please!");
    }//GEN-LAST:event_searchTicketBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        if (!ticketID.getText().equals("--")) {
            try {
                int x = JOptionPane.showConfirmDialog(null, "Confirm and delete ?", "Delete ticket "+currentSelectedTicket[0]+"", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    ArrayList<String[]> trips = FileStorage.readData("trips");
                    ArrayList<String> selectedTrip = new ArrayList<>();
                    for (int i=0; i < trips.size(); i++) {
                        if(trips.get(i)[0].equals(currentSelectedTicket[2]) && trips.get(i)[1].equals(currentSelectedTicket[8]) && trips.get(i)[2].equals(currentSelectedTicket[9])){
                            for (String tripDetail : trips.get(i)) {
                                selectedTrip.add(tripDetail);
                            }
                            break;
                        }
                    }
                    if (edit.equals("true")){
                        if (selectedTrip.contains(currentSelectedTicket[7])){
                            selectedTrip.remove(currentSelectedTicket[7]);
                        }
                    }
                    String[] updatedRows = new String[selectedTrip.size()];
                    updatedRows = selectedTrip.toArray(updatedRows);
                    FileStorage.updateTrip("trips", currentSelectedTicket[2],currentSelectedTicket[8],currentSelectedTicket[9], updatedRows);
                    FileStorage.deleteRecord("tickets", currentSelectedTicket[0]);
                    JOptionPane.showMessageDialog(null, "Ticket number "+ currentSelectedTicket[0] +" is deleted successfully!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Deleting ticket number "+currentSelectedTicket[0]+" have been canceled!");
                }
            } catch (Exception e) {
            }
        }else {
            JOptionPane.showMessageDialog(null, "Press Search first");
        }
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void destinationDropMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationDropMenuActionPerformed
        if(originDropMenu.getSelectedItem().toString().equals("-- Select Origin --")){
            ArrayList<String> origin = new ArrayList<>();
            try {
                ArrayList<String[]> cities = FileStorage.readData("cities");
                for (String[] city : cities) {
                    if (destinationDropMenu.getSelectedItem().toString().equals((city[2]))) {
                        origin.add(city[1]);
                    }
                }
            } catch (Exception e) {
            }
            String[] originArr = new String[origin.size()+1];
            originArr[0] = "-- Select Origin --";
            for (int i =0; i < origin.size(); i++) {
                originArr[i+1] = origin.get(i);
            }
            DefaultComboBoxModel originModel = new DefaultComboBoxModel(originArr);
            originDropMenu.setModel(originModel);
        }
    }//GEN-LAST:event_destinationDropMenuActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        jTable2.setModel(model);
        try {
            ArrayList<String[]> buses = FileStorage.readData("buses");
            String[] ColumnNames = buses.get(0);
            ColumnNames[6] = "";
            for (String ColumnName : ColumnNames) {
                if (!ColumnName.equals("")){
                    if (ColumnName.equals("fare")) {
                        ColumnName = "Cash";
                    }
                    if (ColumnName.equals("id")) {
                        ColumnName = "Number";
                    }
                    if (ColumnName.equals("origin")) {
                        ColumnName = "Origin";
                    }
                    if (ColumnName.equals("destination")) {
                        ColumnName = "Destination";
                    }
                    if (ColumnName.equals("distance")) {
                        ColumnName = "Distance";
                    }
                    if (ColumnName.equals("seats")) {
                        ColumnName = "Seats";
                    }
                    model.addColumn(ColumnName);
                }
            }
            buses.remove(0);
            ArrayList<String> busIDS = new ArrayList<>();
            for (String[] bus:buses){
                if (bus[1].equals(originDropMenu.getSelectedItem().toString()) && bus[2].equals(destinationDropMenu.getSelectedItem().toString())){
                    model.addRow(bus);
                    busIDS.add(bus[0]);
                }
                String[] busIDSArr = new String[busIDS.size()];
                busIDSArr = busIDS.toArray(busIDSArr);
                DefaultComboBoxModel idsDropMenu = new DefaultComboBoxModel(busIDSArr);
                selectBusDropMenu.setModel(idsDropMenu);
            }} catch (Exception e) {}

    }//GEN-LAST:event_searchBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_nextBtnActionPerformed

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        // TODO add your handling code here:
        if(selectBusDropMenu.getModel().getSize()!=0) {
            origin.setText(originDropMenu.getSelectedItem().toString());
            destination.setText(destinationDropMenu.getSelectedItem().toString());
            distance.setText(getBusData(3));
            fare.setText(getBusData(4));
            for (int i = 6; i < busArrSize; i++) {
                timeComboBoxModel.addElement(getBusData(i));
            }
            tabbedPane.setSelectedIndex(tabbedPane.indexOfTab("Step 2"));
            tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 2"), true);
            tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 1"), false);
        }else JOptionPane.showMessageDialog(null,"Select a Bus to Continue.");
        datePicker.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent e) {
                    checkSeats();
                }
            });
    }//GEN-LAST:event_nextBtnMouseClicked


    private void originDropMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originDropMenuActionPerformed
        if(destinationDropMenu.getSelectedItem().toString().equals("-- Select Destination --")){
            ArrayList<String> destination = new ArrayList<>();
            try {
                ArrayList<String[]> cities = FileStorage.readData("cities");
                for (String[] city : cities) {
                    if (originDropMenu.getSelectedItem().toString().equals((city[1]))) {
                        destination.add(city[2]);
                    }
                }
            } catch (Exception e) {
            }
            String[] destinationArr = new String[destination.size()+1];
            destinationArr[0] = "-- Select Destination --";
            for (int i =0; i < destination.size(); i++) {
                destinationArr[i+1] = destination.get(i);
            }
            DefaultComboBoxModel destinationModel = new DefaultComboBoxModel(destinationArr);
            destinationDropMenu.setModel(destinationModel);
        }
    }//GEN-LAST:event_originDropMenuActionPerformed

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        // TODO add your handling code here:
        formOpened();
    }//GEN-LAST:event_clearBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        timeComboBoxModel.removeAllElements();
        datePicker.setDate(null);
        //seatComboBoxModel.removeAllElements();
        seatDropMenu.setSelectedIndex(0);
        seatDropMenu.setEnabled(false);
        tabbedPane.setSelectedIndex(tabbedPane.indexOfTab("Step 1"));
        tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 1"), true);
        tabbedPane.setEnabledAt(tabbedPane.indexOfTab("Step 2"), false);
    }//GEN-LAST:event_backBtnMouseClicked

    private void datePickerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePickerPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_datePickerPropertyChange


    public static void main(String args[], String editable) {
        if (editable.equals("true")) {
            edit = "true";
        } else edit = "false";
        authUser = args;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton clearBtn;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel destination;
    private javax.swing.JComboBox<String> destinationDropMenu;
    private javax.swing.JLabel distance;
    private javax.swing.JLabel fare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel noteMsg;
    private javax.swing.JLabel origin;
    private javax.swing.JComboBox<String> originDropMenu;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchTicketBtn;
    private javax.swing.JComboBox<String> seatDropMenu;
    private javax.swing.JComboBox<String> selectBusDropMenu;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel ticketID;
    private javax.swing.JTextField ticketIDText;
    private javax.swing.JComboBox<String> timeDropMenu;
    // End of variables declaration//GEN-END:variables
}
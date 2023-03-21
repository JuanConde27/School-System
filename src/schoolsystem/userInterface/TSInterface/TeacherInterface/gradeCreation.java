/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package schoolsystem.userInterface.TSInterface.TeacherInterface;

import Modelos.CourseM;
import Modelos.StudentM;
import Modelos.SubjectM;
import UserInterfaces.Course;
import UserInterfaces.Subject;
import java.awt.event.ItemEvent;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import schoolsystem.userInterface.TSInterface.StudentInterface.Grade;
import schoolsystem.users.Student;
import schoolsystem.users.Teacher;
import schoolsystem.users.UserList;

/**
 *
 * @author gustavocamargo
 */
public class gradeCreation extends javax.swing.JPanel {
    
    DefaultComboBoxModel modelC = new DefaultComboBoxModel();
    DefaultComboBoxModel modelS = new DefaultComboBoxModel();
    DefaultComboBoxModel modelSt = new DefaultComboBoxModel();
    
    
    
    public int position;
    
    public Vector lista = UserList.getTeacherList();
    
    public Vector students = UserList.getStudentList(); 
    
    
    

    /**
     * Creates new form gradeCreation
     * @param pos
     */
    public gradeCreation(int pos) {
        position = pos;
        initComponents();
        loadCourse(coursesComboBox);
        loadStudents(studentsComboBox);
        loadSubjects(subjectsComboBox);
    }
    
    private void loadCourse(JComboBox coursesComboBox) {
        Teacher teacher = (Teacher)lista.elementAt(position);
        System.out.println(teacher.getCourses().size());
        try {
            for (int i = 0; i < teacher.getCourses().size(); i++) {
                 
                if (teacher.getCourses().get(i)!= null) {
                    modelC.addElement(new CourseM(teacher.getCourses().get(i).getCourseName()));
                } else {
                    modelC.addElement(i);
                }
            }
            
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "ERROR", "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Course course;
    
    private void loadStudents(JComboBox studentsComboBox) {
        Course selectedCourse = course;
        try {
            for (int i = 0; i < selectedCourse.getStudents().size(); i++) {
                 
                if (selectedCourse.getStudents().get(i)!= null) {
                    modelSt.addElement(new StudentM(selectedCourse.getStudents().get(i).getName(), selectedCourse.getStudents().get(i).getUser()));
                } else {
                    modelSt.addElement(i);
                }
            }
            
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "ERROR", "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadSubjects(JComboBox subjectsComboBox) {
        Teacher teacher = (Teacher)lista.elementAt(position);
        try {
            for (int i = 0; i < teacher.getSubjects().size(); i++) {
                 
                if (teacher.getSubjects().get(i)!= null) {
                    modelS.addElement(new SubjectM(teacher.getSubjects().get(i).getSubjectName()));
                } else {
                    modelS.addElement(i);
                }
            }
            
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "ERROR", "", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coursesComboBox = new javax.swing.JComboBox<>();
        subjectsComboBox = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gradeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        studentsComboBox = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Course");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Subject");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Grade");

        coursesComboBox.setModel(modelC);
        coursesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursesComboBoxItemStateChanged(evt);
            }
        });
        coursesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesComboBoxActionPerformed(evt);
            }
        });

        subjectsComboBox.setModel(modelS);
        subjectsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectsComboBoxItemStateChanged(evt);
            }
        });
        subjectsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectsComboBoxActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrear.setText("Create");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setText("Grade Creation");

        gradeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Student");

        studentsComboBox.setModel(modelSt);
        studentsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(196, 196, 196))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(coursesComboBox, 0, 186, Short.MAX_VALUE)
                                        .addComponent(subjectsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(studentsComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(132, 132, 132))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coursesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnCrear)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Teacher teacher = (Teacher)lista.elementAt(position);
        StudentM selectedStudent = (StudentM) studentsComboBox.getSelectedItem();
        SubjectM selectedSubject = (SubjectM) subjectsComboBox.getSelectedItem();
        
         for (int i = 0; i < students.size(); i++) {
           Student listStudent =  (Student) students.elementAt(i);
           if(selectedStudent.getId().equals(listStudent.getUser())) {
               for (int j = 0; j < teacher.getSubjects().size(); j++) {
                   if (selectedSubject.getName().equals(teacher.getSubjects().get(j).getSubjectName())) {
                       Grade grade = new Grade(listStudent, teacher.getSubjects().get(j), Double.parseDouble(gradeField.getText()));
                       listStudent.setGrade(grade);  
                   }
               }
               break;
           }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void gradeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeFieldActionPerformed

    private void studentsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsComboBoxActionPerformed

    private void coursesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesComboBoxActionPerformed

    private void coursesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursesComboBoxItemStateChanged
        Teacher teacher = (Teacher)lista.elementAt(position);
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            CourseM selectedCourse = (CourseM) coursesComboBox.getSelectedItem();
            for (int i = 0; i < teacher.getCourses().size(); i++) {
                if (selectedCourse.getName().equals(teacher.getCourses().get(i).getCourseName())) {
                    course = teacher.getCourses().get(i);
                }  
            }
        }
    }//GEN-LAST:event_coursesComboBoxItemStateChanged

    private void subjectsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectsComboBoxActionPerformed

    private void subjectsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectsComboBoxItemStateChanged
        
    }//GEN-LAST:event_subjectsComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> coursesComboBox;
    private javax.swing.JTextField gradeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> studentsComboBox;
    private javax.swing.JComboBox<String> subjectsComboBox;
    // End of variables declaration//GEN-END:variables
}

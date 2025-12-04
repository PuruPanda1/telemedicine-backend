package com.example.demo.service;

public class EmailTemplates {

    public static String doctorAlertTemplate(Long consultationId) {

        return """
                <html>
                <body style="font-family: Arial, sans-serif; background-color: #f5f7fa; margin:0; padding:0;">
                
                    <div style="max-width: 600px; margin: auto; background: white; 
                        padding: 20px; border-radius: 8px; box-shadow: 0 2px 8px rgba(0,0,0,0.1);">
                
                        <!-- Logo -->
                        <div style="text-align: center; margin-bottom: 20px;">
                            <img src="https://cdn-icons-png.flaticon.com/512/3209/3209993.png" 
                                 width="80" />
                        </div>

                        <!-- Alert Bar -->
                        <div style="background: #ff4d4d; padding: 12px; color: white; 
                                text-align: center; font-size: 20px; font-weight: bold; 
                                border-radius: 6px;">
                            ⚠️ ALERT!
                        </div>

                        <!-- Main Content -->
                        <h2 style="color: #333; margin-top: 25px;">New Consultation Request</h2>
                        <p style="font-size: 15px; color: #555;">
                            Dear Doctor,<br><br>
                            You have received a <strong>new consultation request</strong>.  
                            Please review the details below:
                        </p>

                        <div style="background: #e6f2ff; padding: 15px; border-radius: 6px; 
                                    font-size: 16px; margin: 20px 0; border-left: 5px solid #3399ff;">
                            <strong>Consultation ID:</strong> """ + consultationId + """
                        </div>

                        <p style="color: #555; font-size: 14px;">
                            Kindly attend to the consultation at your earliest convenience.
                        </p>

                        <!-- Footer -->
                        <div style="margin-top: 40px; text-align: center; font-size: 12px; color: #999;">
                            © 2025 E-Telemedicine System · Automated Notification Service
                        </div>
                    </div>

                </body>
                </html>
                """;
    }
    
    public static String patientAcceptedTemplate(Long consultationId) {

        return """
                <html>
                <body style="font-family: Arial, sans-serif; background-color: #f5f7fa; margin:0; padding:0;">

                    <div style="max-width: 600px; margin: auto; background: white;
                        padding: 20px; border-radius: 8px;
                        box-shadow: 0 2px 8px rgba(0,0,0,0.1);">

                        <!-- Logo -->
                        <div style="text-align: center; margin-bottom: 20px;">
                            <img src="https://cdn-icons-png.flaticon.com/512/3209/3209993.png"
                                 width="80" />
                        </div>

                        <!-- Success Banner -->
                        <div style="background: #28a745; padding: 12px; color: white;
                                text-align: center; font-size: 20px; font-weight: bold;
                                border-radius: 6px;">
                            ✔ CONSULTATION CONFIRMED
                        </div>

                        <!-- Main Content -->
                        <h2 style="color: #333; margin-top: 25px;">Your Consultation is Accepted!</h2>
                        <p style="font-size: 15px; color: #555;">
                            Good news! Your consultation request has been <strong>accepted by the doctor</strong>.
                            Please be available at your scheduled time.
                        </p>

                        <div style="background: #e6ffe6; padding: 15px; border-radius: 6px;
                                    font-size: 16px; margin: 20px 0;
                                    border-left: 5px solid #28a745;">
                            <strong>Consultation ID:</strong> """ + consultationId + """
                        </div>

                        <p style="color: #555; font-size: 14px;">
                            If you need to reschedule, please visit the portal or contact the clinic.
                        </p>

                        <!-- Footer -->
                        <div style="margin-top: 40px; text-align: center; font-size: 12px; color: #999;">
                            © 2025 E-Telemedicine · Automated Notification Service
                        </div>
                    </div>

                </body>
                </html>
                """;
    }

    public static String patientRejectedTemplate(Long consultationId) {

        return """
                <html>
                <body style="font-family: Arial, sans-serif; background-color: #f5f7fa; margin:0; padding:0;">

                    <div style="max-width: 600px; margin: auto; background: white;
                        padding: 20px; border-radius: 8px;
                        box-shadow: 0 2px 8px rgba(0,0,0,0.1);">

                        <!-- Logo -->
                        <div style="text-align: center; margin-bottom: 20px;">
                            <img src="https://cdn-icons-png.flaticon.com/512/3209/3209993.png"
                                 width="80" />
                        </div>

                        <!-- Rejection Banner -->
                        <div style="background: #dc3545; padding: 12px; color: white;
                                text-align: center; font-size: 20px; font-weight: bold;
                                border-radius: 6px;">
                            ❌ CONSULTATION REJECTED
                        </div>

                        <!-- Main Content -->
                        <h2 style="color: #333; margin-top: 25px;">Your Consultation Was Not Accepted</h2>
                        <p style="font-size: 15px; color: #555;">
                            We’re sorry to inform you that your consultation request was
                            <strong>rejected by the doctor</strong>.
                        </p>
                        
                        <p style="font-size: 15px; color: #555;">
                            This may be because the doctor is <strong>busy</strong>, 
                            has a <strong>full schedule</strong>, or is not available on the selected date.
                        </p>

                        <div style="background: #ffe6e6; padding: 15px; border-radius: 6px;
                                    font-size: 16px; margin: 20px 0;
                                    border-left: 5px solid #dc3545;">
                            <strong>Consultation ID:</strong> """ + consultationId + """
                        </div>

                        <p style="color: #555; font-size: 14px;">
                            Please try booking for another date or choose a different doctor.
                            We apologize for the inconvenience.
                        </p>

                        <!-- Footer -->
                        <div style="margin-top: 40px; text-align: center; font-size: 12px; color: #999;">
                            © 2025 E-Telemedicine · Automated Notification Service
                        </div>
                    </div>

                </body>
                </html>
                """;
    }

    public static String patientCompletedTemplate(Long consultationId) {

        return """
                <html>
                <body style="font-family: Arial, sans-serif; background-color: #f5f7fa; margin:0; padding:0;">

                    <div style="max-width: 600px; margin: auto; background: white;
                        padding: 20px; border-radius: 8px;
                        box-shadow: 0 2px 8px rgba(0,0,0,0.1);">

                        <!-- Logo -->
                        <div style="text-align: center; margin-bottom: 20px;">
                            <img src="https://cdn-icons-png.flaticon.com/512/3209/3209993.png"
                                 width="80" />
                        </div>

                        <!-- Success Banner -->
                        <div style="background: #28a745; padding: 12px; color: white;
                                text-align: center; font-size: 20px; font-weight: bold;
                                border-radius: 6px;">
                            ✔ Thank you for visiting
                        </div>

                        <!-- Main Content -->
                        <h2 style="color: #333; margin-top: 25px;">Your Consultation is Completed!</h2>
                        <p style="font-size: 15px; color: #555;">
                            We hope you had a good time and will feel better.
                            Thank you for your time.
                        </p>

                        <div style="background: #e6ffe6; padding: 15px; border-radius: 6px;
                                    font-size: 16px; margin: 20px 0;
                                    border-left: 5px solid #28a745;">
                            <strong>Consultation ID:</strong> """ + consultationId + """
                        </div>

                        <p style="color: #555; font-size: 14px;">
                            If you need to revisit, please visit the portal or contact the clinic.
                        </p>

                        <!-- Footer -->
                        <div style="margin-top: 40px; text-align: center; font-size: 12px; color: #999;">
                            © 2025 E-Telemedicine · Automated Notification Service
                        </div>
                    </div>

                </body>
                </html>
                """;
    }

}

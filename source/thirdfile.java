 QObject::connect(m_dialog, SIGNAL(finished(bb::system::SystemUiResult::Type)),this,
                 SLOT(promptHandler(bb::system::SystemUiResult::Type)));
    m_dialog->show();
if(m_scanDailogTimeOut->isActive())
    {
    	m_scanDailogTimeOut->stop();
    }

    m_scanDailogTimeOut->start(5*1000);


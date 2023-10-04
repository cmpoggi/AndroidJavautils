void createNewWidget () {
        Context context = getBaseContext();
        AppWidgetManager mAppWidgetManager;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            mAppWidgetManager = context.getSystemService(AppWidgetManager.class);
            AppWidgetProviderInfo myWidgetProviderInfo = new AppWidgetProviderInfo();
            ComponentName myProvider = new ComponentName(context, YOURWIDGETCLASS.class);
            if (mAppWidgetManager.isRequestPinAppWidgetSupported()) {
                Intent pinnedWidgetCallbackIntent = new Intent();
                PendingIntent successCallback = PendingIntent.getBroadcast(context, 0,
                        pinnedWidgetCallbackIntent, PendingIntent.FLAG_UPDATE_CURRENT
                                | PendingIntent.FLAG_IMMUTABLE);
                mAppWidgetManager.requestPinAppWidget(myProvider, null, successCallback);
            }
        }
    }

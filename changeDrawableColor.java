Drawable setIconColor(int resId, int newColor) {
        //para cambiar el color del icono en el boton
        Drawable oldIcon = ResourcesCompat.getDrawable(context.getResources(),
                resId, context.getTheme());
        Drawable newIcon = Objects.requireNonNull(oldIcon.getConstantState()).newDrawable();
        newIcon.mutate().setColorFilter(newColor, PorterDuff.Mode.MULTIPLY);
        return newIcon;
    }

// enable clicked form
const enableForm = (idx) => {
    const fieldSetId = 'field-set'+idx;
    const fieldSets = document.querySelectorAll('form > fieldset');
    const fieldSetsArray = Array.apply(null, fieldSets);

    // disable other fieldsets if enabled
    const enabledfieldSet = fieldSetsArray.filter(fs => !fs.disabled && fs.id !== fieldSetId);
    if(enabledfieldSet.length) {
        enabledfieldSet.forEach(f => f.disabled = true);
    }

    // enable clicked item
    const fieldSet = document.getElementById(fieldSetId);
    fieldSet.disabled = false;
}
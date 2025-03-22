document.getElementById('taskInput').addEventListener('keypress', function(e) {
    if (e.key === 'Enter' && this.value) {
        addTask(this.value);
        this.value = '';
    }
});

function addTask(task) {
    let li = document.createElement('li');
    li.textContent = task;

    let removeBtn = document.createElement('button');
    removeBtn.textContent = 'Remove';
    removeBtn.addEventListener('click', function() {
        li.remove();
    });

    li.appendChild(removeBtn);
    document.getElementById('taskList').appendChild(li);
}

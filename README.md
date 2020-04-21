# Math

Vmware math does two operations add and diff

## API

ADD api for adding numerical string

```bash
POST http://{ip}/api/add
```

##### Usage

```python
payload: { "x":"100", "y":"50" } response: { "result": "150" }
```

DIFF api for subtracting numerical string

```bash
POST http://{ip}/api/diff
```

##### Usage

```python
payload: { "x":"100", "y":"50" } response: { "result": "50" }

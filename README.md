### Xóa commit không lưu lại history
	* git log
	* git reset --hard HEAD^ (xóa commit gần nhất)
	* git reset --hard HEAD~n (n là số commit muốn xóa)
	* git reset --hard <commit-hash> (xóa từ trước đó đến commit chỉ định (commit chỉ định củng bị xóa))
	* git push --force
	
### Revert branch khi đã lỡ merged
